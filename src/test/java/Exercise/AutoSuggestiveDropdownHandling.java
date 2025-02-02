package Exercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdownHandling 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Locate the auto-suggest DropDown and type 'Indi'
		WebElement autoSuggestInput = driver.findElement(By.cssSelector("#autocomplete"));
		autoSuggestInput.sendKeys("Indi");
		Thread.sleep(2000); // Wait for suggestions to appear

		// Fetch the list of suggestions
		List<WebElement> options = driver.findElements(By.cssSelector(".ui-menu-item-wrapper"));

		// Loop through the suggestions and select "India"
		for (WebElement option : options) 
		{
			if (option.getText().equals("India")) 
			{
				option.click();
				break;
			}
		}

		// Validate if "India" is selected
		String selectedValue = autoSuggestInput.getAttribute("value");
		if (selectedValue.equals("India"))
		{
			System.out.println("Test Passed: 'India' is selected successfully!");
		} 
		else 
		{
			System.out.println("Test Failed: Expected 'India' but got '" + selectedValue + "'");
		}

		Thread.sleep(3000);
		driver.quit();
	}
}
