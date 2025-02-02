package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launching_diffrent_browsers 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		
		// launching chrome browser(webdriver.chrome.driver)
		//System.setProperty("webdriver.chrome.driver", "/users/shrinivas/documents/dhromedriver");
		//WebDriver driver = new ChromeDriver();
		
		// Launching Firefox browser (webdriver.gecko.driver)
		//System.setProperty("webdriver.gecko.driver", "/users/shrinivas/documents/geckodriver");
		//WebDriver driver = new FirefoxDriver();
		
		// Launching Edge browser(webdriver.edge.driver)
		//System.setProperty("webdriver.edge.driver", "/users/shrinivas/documents/msedgedriver");
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(5000);
		
		driver.quit();
	}
}
