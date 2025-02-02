package windowsOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizingTheWindowAndDeletingCookies 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// Maximizing the window
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/");
			
		// Deleting all cookies 
		driver.manage().deleteAllCookies();
		
		// Deleting only session cookies 
		//driver.manage().deleteCookieNamed("session string which you want to delete");
		
		Thread.sleep(5000);
		driver.quit();
	}
}
