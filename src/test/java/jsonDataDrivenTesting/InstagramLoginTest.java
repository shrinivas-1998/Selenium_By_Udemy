package jsonDataDrivenTesting;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class InstagramLoginTest 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Read JSON file
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode jsonNode = objectMapper.readTree(new File(System.getProperty("user.dir") + "\\src\\test\\resources\\testData.json"));
		String username = jsonNode.get("username").asText();
		String password = jsonNode.get("password").asText();

		// Open Instagram login page
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(3000); // Wait for page to load

		// Locate elements and perform login
		WebElement usernameField = driver.findElement(By.name("username"));
		WebElement passwordField = driver.findElement(By.name("password"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		loginButton.click();

		// Verification logic
		Thread.sleep(5000);
		if (driver.getCurrentUrl().contains("instagram.com")) 
		{
			System.out.println("Login successful");
		} 
		else 
		{
			System.out.println("Login failed");
		}

		driver.quit();
	}
}
