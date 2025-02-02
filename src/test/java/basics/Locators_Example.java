package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Example 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.cricbuzz.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[@class = 'cb-plus-ico cb-user-icon']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@placeholder = 'Email Id/Mobile Number']")).sendKeys("shrinivasb@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@role = 'presentation'])[1]")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//button[@type = 'button'])[1]")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
	}
}
