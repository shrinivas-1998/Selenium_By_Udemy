package other;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingCountOfLinksAndOpenEachLinkInDifferentTab 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// 1.Getting the counts of links which is present on web page
		System.out.println(driver.findElements(By.tagName("a")).size());

		// 2.Getting the counts of lonks which is present in Footer
		WebElement FootDriver = driver.findElement(By.xpath("//div[@id = 'gf-BIG']")); // Limiting Scope of WebDriver
		System.out.println(FootDriver.findElements(By.tagName("a")).size());

		// 3.Getting counts of links in first column
		WebElement columnDriver = FootDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());

		// 4. click on each links in a column and check it is opening or not
		for (int i = 1; i < columnDriver.findElements(By.tagName("a")).size(); i++) 
		{
			String ClickOnTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(ClickOnTab);
			Thread.sleep(5000);
		}

	}
}
