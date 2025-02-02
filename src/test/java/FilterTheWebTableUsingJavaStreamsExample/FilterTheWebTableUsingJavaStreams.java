package FilterTheWebTableUsingJavaStreamsExample;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FilterTheWebTableUsingJavaStreams 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		Thread.sleep(5000);

		// Search for "Rice"
		driver.findElement(By.id("search-field")).sendKeys("Rice");

		// Get the list of all vegetable names
		List<WebElement> Veggies = driver.findElements(By.xpath("//tr/td[1]")); // 1 results

		// Filtering Rice veggies
		List<WebElement> FilteredList = Veggies.stream().filter(Veggie -> Veggie.getText().contains("Rice"))
				.collect(Collectors.toList()); // 1 results

		// Validation
		Assert.assertEquals(Veggies, FilteredList);
		// Assert.assertEquals(Veggies.size(), FilteredList.size());

		Thread.sleep(5000);
		driver.quit();
	}
}
