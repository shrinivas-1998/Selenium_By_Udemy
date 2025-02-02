package waitsInSelenium;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWaitExample 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
				// expected array
				String[] itemsneeded = { "Brocolli", "Cucumber", "Beans" };
				driver.get("https://rahulshettyacademy.com/seleniumPractise/");
				Thread.sleep(4000);
				AddItems(driver,itemsneeded );
				// clciking on purchase bag symbol
				driver.findElement(By.xpath("//img[@alt = 'Cart']")).click();
				// Clicking on "PROCEED TO CHECKOUT" button
				driver.findElement(By.xpath("//button[text() = 'PROCEED TO CHECKOUT']")).click();
				// sending promo code in text field 
			
				driver.findElement(By.xpath("//input[@class = 'promoCode']")).sendKeys("rahulshettyacademy");
				// Clicking on Apply Button
				driver.findElement(By.cssSelector("button.promoBtn")).click();
				// Printing the message 
				System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	}
	
	public static void AddItems(WebDriver driver, String[] itemsneeded ) throws InterruptedException
	{
		int j = 0;
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
		//driver.quit();
	}

}
