package BrokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class CheckingBrokenLinks
{
	public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// broken URL

		// Step 1 - IS to get all urls tied up to the links using Selenium
		// Java methods will call URL's and gets you the status code
		// if status code >400 then that url is not working-> link which tied to url is
		// broken
		// a[href*="soapui"]'

		List<WebElement> Links = driver.findElements(By.xpath("//li[@class = 'gf-li']/a"));
		SoftAssert sa = new SoftAssert();

		for (WebElement link : Links) 
		{
			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int ResponseCode = conn.getResponseCode();
			System.out.println(ResponseCode);

			// Soft Assert
			sa.assertTrue(ResponseCode < 400,
					"The link with text '" + link.getText() + "' is broken with code: " + ResponseCode);

			// Hard Assert
			// Assert.assertTrue(ResponseCode<400, "The link with Text "+link.getText()+"is
			// broken with code :"+ResponseCode);
		}
		sa.assertAll();
		Thread.sleep(5000);
		driver.quit();
	}
}
