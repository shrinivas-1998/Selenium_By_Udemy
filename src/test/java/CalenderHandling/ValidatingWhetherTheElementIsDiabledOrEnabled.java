package CalenderHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ValidatingWhetherTheElementIsDiabledOrEnabled 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// driver.get("https://www.spicejet.com/");
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		 System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	   //  driver.findElement(By.id("Div1")).getAttribute("style");
		 Thread.sleep(5000);
	     driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		 System.out.println( driver.findElement(By.id("Div1")).getAttribute("style"));

		 if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		 {
			 System.out.println("its Enabled");
			 Assert.assertTrue(true);
		 }
		 else
		 {
			 Assert.assertTrue(false);
		 } 
		 Thread.sleep(5000);
		 driver.quit();
	}
}
