package Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentByUsingVariableToStoreSelectedOption 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Click on the CheckBox
		driver.findElement(By.cssSelector("#checkBoxOption2")).click();

		// Store the grabbed text from the CheckBox label
		WebElement checkbox = driver.findElement(By.xpath("//label[@for='benz']"));
		String selectedOption = checkbox.getText();
		System.out.println("Selected Checkbox Text: " + selectedOption);

		// Select the same option in the DropDown using the variable
		WebElement dropDown = driver.findElement(By.cssSelector("#dropdown-class-example"));
		Select select = new Select(dropDown);
		select.selectByVisibleText(selectedOption);

		// Print the selected option from the DropDown
		String selectedDropdownText = select.getFirstSelectedOption().getText();
		System.out.println("Currently Selected Dropdown Option: " + selectedDropdownText);

		// Enter the text in the alert text field
		driver.findElement(By.cssSelector("#name")).sendKeys(selectedOption);

		// Click on the alert button
		driver.findElement(By.cssSelector("#alertbtn")).click();

		// Get the alert text
		String alertText = driver.switchTo().alert().getText();
		System.out.println("Alert Message: " + alertText);

		// Verify if the alert contains the entered text
		if (alertText.contains(selectedOption)) 
		{
			System.out.println("Alert text verification PASSED!");
		} 
		else 
		{
			System.out.println("Alert text verification FAILED!");
		}

		// Accept the alert
		driver.switchTo().alert().accept();

		// Wait and close the browser
		Thread.sleep(5000);
		driver.quit();
	}
}
