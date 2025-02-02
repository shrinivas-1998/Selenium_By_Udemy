package GettingPriceOfAnProduct;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GettingPriceOfAnProduct 
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

		// Scan the name column with getText -> beans -> print the price of Beans
		List<String> Price = elementList.stream().filter(s -> s.getText().contains("Beans")).map(s -> getPriceVeggie(s))
				.collect(Collectors.toList());
		Price.forEach(s -> System.out.println(s));

		Thread.sleep(5000);
		driver.quit();
	}

	private static String getPriceVeggie(WebElement s) 
	{
		// TODO Auto-generated method stub
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();

		return pricevalue;
	}
}
