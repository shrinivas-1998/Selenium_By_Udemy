package Exercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingNestedFrames 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://the-internet.herokuapp.com");

		// Navigate to the "Nested Frames" page
		driver.findElement(By.xpath("//a[text() = 'Nested Frames']")).click();

		// Switch to First Frame (by Name)
		driver.switchTo().frame("frame-top"); // Parent frame
		driver.switchTo().frame("frame-left"); // // Child frame inside parent
		System.out.println("Switched to Left Frame");

		// Perform action inside Left Frame
		WebElement LeftFrame = driver.findElement(By.tagName("body"));
		System.out.println("Text in Left Frame: " + LeftFrame.getText());

		// Switch back to the Parent Frame
		driver.switchTo().parentFrame();

		// Switch to another Child Frame (Middle Frame)
		driver.switchTo().frame("frame-middle");
		System.out.println("Switched to Middle Frame");
		System.out.println("Text in Middle Frame: " + driver.findElement(By.tagName("div")).getText());

		// Switch back to the Main HTML (Root)
		driver.switchTo().defaultContent();

		// Now switch to Bottom Frame
		driver.switchTo().frame("frame-bottom");
		System.out.println("Switched to Bottom Frame");
		System.out.println("Text in Bottom Frame: " + driver.findElement(By.tagName("body")).getText());

		// Close the browser
		driver.quit();
	}
}
