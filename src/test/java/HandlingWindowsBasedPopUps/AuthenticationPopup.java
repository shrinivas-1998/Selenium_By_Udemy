package HandlingWindowsBasedPopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to the specified URL
		// driver.get("https://the-internet.herokuapp.com/");

		// Format for Basic Authentication URL
		// http://username:password@SiteURL
		// Uncomment the below line if you want to directly use Basic Authentication
		driver.get("http://admin:admin@the-internet.herokuapp.com/");

		// Click on the "Basic Auth" link
		driver.findElement(By.linkText("Basic Auth")).click();
	}
}
