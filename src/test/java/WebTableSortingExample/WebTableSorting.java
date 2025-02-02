package WebTableSortingExample;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableSorting 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		Thread.sleep(5000);

		// Click on Column "Veg/fruit name"
		driver.findElement(By.xpath("//tr/th[1]")).click();

		// Capture all webelements into List
		List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));

		// Capture text of all webelements into new(original) List
		List<String> OriginalList = elementList.stream().map(s -> s.getText()).collect(Collectors.toList());

		// Sort on the original list
		List<String> sortedList = OriginalList.stream().sorted().collect(Collectors.toList());

		// Compare original List vs Sorted List
		Assert.assertTrue(OriginalList.equals(sortedList));
	}
}
