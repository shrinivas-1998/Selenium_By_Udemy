package CalenderHandling;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalenderTest 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		// Define date components
		String monthNumber = "6"; // June
		String date = "15";
		String year = "2027";
		String[] ExpectedList = { monthNumber, date, year};

		// Initialize WebDriver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Navigate to the webpage
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		// Open the calendar widget
		driver.findElement(By.xpath("//div[@class='react-date-picker__inputGroup']")).click();
		Thread.sleep(4000);

		// Select the year
		driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
		driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
		driver.findElement(By.xpath("//button[text()='" + year + "']")).click();
		Thread.sleep(4000);

		// Select the month
		driver.findElements(By.xpath("//button[contains(@class, 'react-calendar__year-view__months__month')]"))
				.get(Integer.parseInt(monthNumber) - 1).click();
		Thread.sleep(4000);

		// Select the date
		driver.findElement(By.xpath("//abbr[text()='" + date + "']")).click();
		Thread.sleep(4000);

		// Getting Date and using Asseretions for Vlidation of date
		// driver.findElement(By.xpath("//div[@class =
		// 'react-date-picker__inputGroup']")).getText();
		List<WebElement> ActualList = driver.findElements(By.xpath("//input[@autocomplete = 'off']"));
		for (int i = 0; i < ActualList.size(); i++) 
		{
			System.out.println(ActualList.get(i).getAttribute("value")); // getting attribute value
			Assert.assertEquals(ActualList.get(i).getAttribute("value"), ExpectedList[i]); // comparing results 
		}

		// Close the browser
		Thread.sleep(5000);
		driver.quit();
	}
}
