package DropDownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingAutoSuggestiveDropdown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get(" https://rahulshettyacademy.com/dropdownsPractise/");
		// Typing ind in AutoSuggestive dropdown
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(4000);
	    List<WebElement> options =	driver.findElements(By.xpath("//li[@class = 'ui-menu-item']/a"));
	    
	    for(WebElement option:options)
	    {
	    	// Selecting India option from Autosuggestions options
	    	if(option.getText().equalsIgnoreCase("India"))
	    	{
	    		option.click();
	    		System.out.println(option.getText());
	    		break;
	    	}
	    }
	    
	    Thread.sleep(4000);
	    driver.quit();	
	}
}
