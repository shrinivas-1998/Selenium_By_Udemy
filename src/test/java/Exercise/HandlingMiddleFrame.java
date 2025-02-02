package Exercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMiddleFrame 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://the-internet.herokuapp.com");

		// Navigate to the "Nested Frames" page
		driver.findElement(By.xpath("//a[text() = 'Nested Frames']")).click();
		// Switch to First Frame (by Name)

		driver.switchTo().frame("frame-top"); // Parent framedriver.switchTo().frame("frame-middle");
		System.out.println("Switched to Middle Frame");
		System.out.println("Text in Middle Frame: " + driver.findElement(By.tagName("div")).getText());

		Thread.sleep(5000);
		driver.quit();
	}
}
