package framesHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrames 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");

		// Getting counts of frame
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		// Switching to Frame
		// driver.findElement(By.xpath("//iframe[@class = 'demo-frame']"));
		// driver.switchTo().frame(1); // by using index
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class = 'demo-frame']")));

		Actions action = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		Thread.sleep(5000);
		// Dragging and dropping webelement
		action.dragAndDrop(source, target).build().perform();

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.quit();
	}
}
