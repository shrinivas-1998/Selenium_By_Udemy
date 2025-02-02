package CalenderHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectingDateFromCalender 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// driver.get("https://www.spicejet.com/");
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		// Clicking on dropdown button
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		// Selecting city for FROM Dropdown 
		//driver.findElement(By.xpath("(//a[@value = 'HYD'])[1]")).click(); // xpath by using indexes
		//System.out.println(driver.findElement(By.xpath("(//a[@value = 'HYD'])[1]")).getText());
		// xpath by using parent child relationship 
		driver.findElement(By.xpath("//div[@id = 'ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value = 'HYD']")).click(); 
		System.out.println(driver.findElement(By.xpath("//div[@id = 'ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value = 'HYD']")).getText());
		Thread.sleep(3000);
		
		// Selecting city for TO Dropdown 
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		//driver.findElement(By.xpath("(//a[@value = 'BOM'])[2]")).click();
		//System.out.println(driver.findElement(By.xpath("(//a[@value = 'BOM'])[2]")).getText());
		driver.findElement(By.xpath("//div[@id = 'ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value = 'BOM']")).click();
		// xpath by using parent child relationship 
		System.out.println(driver.findElement(By.xpath("//div[@id = 'ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value = 'BOM']")).getText());
		Thread.sleep(3000);
		
		// Selecting 6 november 2024 from calender 
		driver.findElement(By.xpath("(//span[@class = 'ui-state-default'])[6]")).click();
		System.out.println(driver.findElement(By.xpath("(//span[@class = 'ui-state-default'])[6]")).getText());
		Thread.sleep(3000);
        driver.quit();
	}
}
