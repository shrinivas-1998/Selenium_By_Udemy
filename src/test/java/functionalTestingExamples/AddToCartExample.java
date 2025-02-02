package functionalTestingExamples;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartExample 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// driver.get("https://www.spicejet.com/");

		int j = 0;
		// expected array
		String[] itemsneeded = { "Brocolli", "Cucumber", "Beans" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(4000);
		List<WebElement> Products = driver.findElements(By.cssSelector("h4.product-name"));
		// Counts of an items 
        System.out.println(driver.findElements(By.cssSelector("h4.product-name")).size());
		for (int i = 0; i < Products.size(); i++) 
		{
			// Before Spliting : Beans - 1 Kg
			// After Splitting : "Beans, - 1 Kg"
			// Name[0] = "Beans "
			// Name[1] = "- 1 Kg"
			String[] Name = Products.get(i).getText().split("-");
			String FormattedName = Name[0].trim();
		    //System.out.println(Products.get(i).getText());
			// format it to get actual vegetable name
			// Check whether the product is presentt or not in array
			// convert array into ArrayList

			List itemneededlist = Arrays.asList(itemsneeded);
			if (itemneededlist.contains(FormattedName)) 
			{
				j++;
				// click on Add to cart button
				driver.findElements(By.xpath("//button[text() = 'ADD TO CART']")).get(i).click();
				//System.out.println(driver.findElements(By.xpath("//button[text() = 'ADD TO CART']")).get(i).getText());
				Thread.sleep(4000);
				if (j ==itemsneeded.length) // if(j==3)
				{
					break;
				}
			}
		}
		driver.quit();
	}
}
