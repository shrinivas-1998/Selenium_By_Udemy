package Exercise;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://the-internet.herokuapp.com");

		driver.findElement(By.linkText("Multiple Windows")).click();
		// driver.findElement(By.cssSelector("a[href*='windows']")).click();
		driver.findElement(By.xpath("//a[@target = '_blank']")).click();

		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();

		String parentWindow = it.next();
		// Switching to next or child window
		driver.switchTo().window(it.next());

		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		Thread.sleep(5000);
		// Switching to Parent window
		driver.switchTo().window(parentWindow);
		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());

		Thread.sleep(5000);
		driver.quit();
	}
}
