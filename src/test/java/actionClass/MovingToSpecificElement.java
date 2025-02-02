package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MovingToSpecificElement 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		Actions action = new Actions(driver);
		// Moves to specifc element 
		action.moveToElement(driver.findElement(By.xpath("//a[@id = 'nav-link-accountList']"))).build().perform();
		
		Thread.sleep(5000);
		driver.quit();
	}
}
