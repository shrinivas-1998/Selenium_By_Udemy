package other;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SumOfTheAmountPresentInTable 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// Validating the sum of amount
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum = 0;
		for(int i = 0; i<values.size(); i++)
		{
			//System.out.println(values.get(i).getText());
			sum = sum + Integer.parseInt(values.get(i).getText());
		}
		
		// Validating the sum of amount 
		System.out.println(sum);
		driver.findElement(By.xpath("//div[@class = 'totalAmount']")).getText();
		int Expectedvalue = Integer.parseInt(driver.findElement(By.xpath("//div[@class = 'totalAmount']")).getText().split(":")[1].trim());
        Assert.assertEquals(sum, Expectedvalue);

		Thread.sleep(5000);
		driver.quit();
	}
}
