package SeleniumLatestFeatures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingHeightAndWidthOfWebElement 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		WebElement name = driver.findElement(By.cssSelector("input[name = 'name']"));

		// Capturing Height of name textfield
		System.out.println(name.getRect().getDimension().getHeight());
		
		// Capturing width of name textfield
		System.out.println(name.getRect().getDimension().getWidth());

		Thread.sleep(5000);
		driver.quit();
	}
}
