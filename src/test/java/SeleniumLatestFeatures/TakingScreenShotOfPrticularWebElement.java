package SeleniumLatestFeatures;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakingScreenShotOfPrticularWebElement 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		Thread.sleep(5000);
		driver.switchTo().newWindow(WindowType.TAB);
		
		// Getting window handles ID 
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String ParentWindow= it.next();
		String ChildIdWindow = it.next();
		Thread.sleep(5000);

		// Switching Child window 
		driver.switchTo().window(ChildIdWindow);
		driver.get("https://courses.rahulshettyacademy.com/courses");
		String CourseTitle = driver.findElements(By.cssSelector("div[class = 'course-listing-title']")).get(3).getText();
		Thread.sleep(5000);

		// Switching Parent Window 
		driver.switchTo().window(ParentWindow);
		WebElement name = driver.findElement(By.cssSelector("input[name = 'name']"));
		name.sendKeys(CourseTitle);
		Thread.sleep(5000);

		// Taking screenshot of particular webelement 
		File sourceFile = name.getScreenshotAs(OutputType.FILE);
		File targetFile = new File(System.getProperty("user.dir")+ "\\Screenshots\\nameTextField.png");
		Files.copy(sourceFile, targetFile);
		
	    // Close the browser
		Thread.sleep(5000);
		driver.quit();
	}
}
