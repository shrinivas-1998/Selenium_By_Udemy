package DropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// driver.get("https://www.spicejet.com/");
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(4000);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		// selecting dropdown by using while Loop
	/*	int i = 1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
	*/	
		// selecting dropdown by using for Loop
		for(int i =1; i<5; i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			Thread.sleep(2000);
			i++;
		}
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Thread.sleep(2000);
		
		// clicking on Done button 
		driver.findElement(By.id("btnclosepaxoption")).click();
		Thread.sleep(2000);

		driver.quit();
	}
}
