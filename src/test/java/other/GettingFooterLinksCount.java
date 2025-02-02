package other;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingFooterLinksCount 
{
	public static void main(String[] args) 
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

	}
}
