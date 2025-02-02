package Exercise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxesExcercise 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		// Selecting or checking the first checkbox and verify that whether it's checked
		// or not
		WebElement firstCheckBox = driver.findElement(By.xpath("//input[@id = 'checkBoxOption1']"));
		firstCheckBox.click();
		System.out.println("First checkbox selected: " + firstCheckBox.isSelected());

		Thread.sleep(4000);

		// UnSelecting or Unchecking the first checkbox and verify that whether it's
		// Unchecked or not
		firstCheckBox.click();
		System.out.println("First checkbox Unselected: " + firstCheckBox.isSelected());

		// Get the count of all CheckBoxes present on the page
		List<WebElement> allCheckBoxes = driver.findElements(By.xpath("//input[@type = 'checkbox']"));
		int totalCheckBoxCount = allCheckBoxes.size();
		System.out.println("Total number of checkboxes on the page: " + totalCheckBoxCount);

		Thread.sleep(5000);
		driver.quit();
	}
}
