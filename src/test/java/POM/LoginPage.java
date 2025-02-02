package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.findElement(By.cssSelector("#username")).sendKeys("rahulshettyacademy");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#password")).sendKeys("learning");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[@class = 'checkmark'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#okayBtn")).click();
		
		WebElement dropdwon = driver.findElement(By.xpath("//select[@class = 'form-control']"));
		Select select = new Select(dropdwon);
		select.selectByVisibleText("Consultant");
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("#terms")).click();
		driver.findElement(By.cssSelector("#signInBtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("ProtoCommerce"));
	}
}
