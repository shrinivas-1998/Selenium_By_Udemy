package Exercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.cssSelector("#checkBoxOption2")).click();
		// driver.findElement(By.xpath("//label[@for = 'benz']")).click();
		// WebElement checkbox = driver.findElement(By.cssSelector("#checkBoxOption2"));
		WebElement checkbox = driver.findElement(By.xpath("//label[@for = 'benz']"));
		  System.out.println("Selected Checkbox Text: " + checkbox.getText());;

		WebElement dropDown = driver.findElement(By.cssSelector("#dropdown-class-example"));
		Select select = new Select(dropDown);
		select.selectByValue("option2");

		// Print the selected option from the dropdown
		String selectedDropdownText = select.getFirstSelectedOption().getText();
		System.out.println("Currently Selected Dropdown Option: " + selectedDropdownText);

		driver.findElement(By.cssSelector("#name")).sendKeys("Option2");
		driver.findElement(By.cssSelector("#alertbtn")).click();

		// Get the alert text
		String alertText = driver.switchTo().alert().getText();
		System.out.println("Alert Message: " + alertText);

		// Verify if the alert contains the entered text
		if (alertText.contains("Option2")) 
		{
			System.out.println("Alert text verification PASSED!");
		} 
		else 
		{
			System.out.println("Alert text verification FAILED!");
		}

		Thread.sleep(5000);
		// driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();

		Thread.sleep(5000);
		driver.quit();
	}
}
