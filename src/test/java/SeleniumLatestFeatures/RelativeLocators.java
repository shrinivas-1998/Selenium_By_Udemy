package SeleniumLatestFeatures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocators 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		// Set up the WebDriver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // Implicit wait to handle elements
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		// Wait for page load (using Thread.sleep for demonstration; replace with
		// explicit waits in production code)
		Thread.sleep(5000);

		// 'above' method: Find label above 'name' input field
		WebElement nameEditBox = driver.findElement(By.xpath("//input[@name = 'name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());

		// 'below' method: Find input field below 'Date of Birth' label
		WebElement DateOfBirth = driver.findElement(By.xpath("//label[@for = 'dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(DateOfBirth)).click();

		// 'toLeftOf' method: Click checkbox for Icecream based on label position
		WebElement IcecreamLabel = driver.findElement(By.xpath("//label[@for = 'exampleCheck1']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(IcecreamLabel)).click();

		// Checking if checkbox is selected
		if (driver.findElement(By.xpath("//input[@id = 'exampleCheck1']")).isSelected()) 
		{
			System.out.println("Ice cream checkbox is selected");
		} 
		else 
		{
			System.out.println("Ice cream checkbox is not selected");
		}

		// 'toRightOf' method: Print the text of the input field to the right of radio
		// button
		WebElement radioButton = driver.findElement(By.xpath("//input[@id = 'inlineRadio1']"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radioButton)).getText());

		// Close the browser after a brief wait
		Thread.sleep(5000);
		driver.quit();
	}
}
