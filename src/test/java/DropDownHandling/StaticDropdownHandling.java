package DropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdownHandling 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get(" https://rahulshettyacademy.com/dropdownsPractise/");
		// if tagname is Select then it is static dropdown
		WebElement StaticDropdown = driver.findElement(By.xpath("//Select[@id = 'ctl00_mainContent_DropDownListCurrency']"));
		Select dropdown = new Select(StaticDropdown);
		
		// selecting static dropdown ByIndex()
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		Thread.sleep(3000);
		
		// selecting static dropdown ByVisibleText()
		dropdown.selectByVisibleText("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		Thread.sleep(3000);
		
		// selecting static dropdown ByValue()
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		Thread.sleep(3000);
		driver.quit();
	}
}
