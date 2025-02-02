package Exercise;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowsAnotherLogic 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://the-internet.herokuapp.com");

		// Click on 'Multiple Windows' link
		driver.findElement(By.linkText("Multiple Windows")).click();

		// Click to open a new window
		driver.findElement(By.xpath("//a[@target='_blank']")).click();

		// Get all window handles
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> iterator = allWindows.iterator();

		String parentWindow = iterator.next(); // Store parent window handle
		String childWindow = null;

		// Ensure there's another window to switch to
		if (iterator.hasNext()) {
			childWindow = iterator.next();
			driver.switchTo().window(childWindow);
			System.out.println("Switched to Child Window: " + driver.getTitle());
			System.out.println(driver.findElement(By.xpath("//div/h3")).getText());

			// Close child window after operation
			driver.close();
		}

		// Switch back to parent window
		driver.switchTo().window(parentWindow);
		System.out.println("Switched back to Parent Window: " + driver.getTitle());
		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());

		// Close browser
		driver.quit();
	}
}
