package windowHandling;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentAndChildWindowHandling 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");

		driver.findElement(By.xpath("//a[@class = 'blinkingText']")).click();
		Set<String> windowsId = driver.getWindowHandles(); // [ParentId,ChildId,subchildid]
		Iterator<String> It = windowsId.iterator();
		String ParentId = It.next();
		String ChildId = It.next();
		driver.switchTo().window(ChildId);
		driver.findElement(By.xpath("//p[@class = 'im-para red']")).getText();

		// splitting entire sentence and getting "emailId = mentor@rahulshettyacademy.com"
		String EmailId = driver.findElement(By.xpath("//p[@class = 'im-para red']")).getText().split("at")[1].trim()
				.split(" ")[0];
		Thread.sleep(5000);
		driver.switchTo().window(ParentId);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys(EmailId);
		Thread.sleep(5000);
		driver.quit();
	}
}
