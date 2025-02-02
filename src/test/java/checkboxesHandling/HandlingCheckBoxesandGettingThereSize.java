package checkboxesHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandlingCheckBoxesandGettingThereSize 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		 driver.get(" https://rahulshettyacademy.com/dropdownsPractise/");
		// Checking whether the checkbox is selected or not 
		 // Using assertions to validate it 
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id = 'ctl00_mainContent_chk_IndArm']")).isSelected());
		
		System.out.println(driver.findElement(By.cssSelector("input[id = 'ctl00_mainContent_chk_IndArm']")).isSelected());
	    WebElement checkbox = driver.findElement(By.cssSelector("input[id = 'ctl00_mainContent_chk_IndArm']"));
	    checkbox.click();
		// Checking whether the checkbox is selected or not 
	    Assert.assertTrue(checkbox.isSelected());
	    
		System.out.println(checkbox.isSelected());
		
		// Getting the count or size of checkboxes
		System.out.println(driver.findElements(By.cssSelector("input[type = 'checkbox']")).size());
		Thread.sleep(2000);
		driver.quit();
	}
}
