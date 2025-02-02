package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WriteTextInCapitalLettersInTextField 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		Actions action = new Actions(driver);
	    WebElement SearchTextField =	driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']"));
	    // Sending "HELLO" word in searchBox and also double click on Hello
	    action.moveToElement(SearchTextField).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
	    
	    Thread.sleep(5000);
	    driver.quit();
	}
}
