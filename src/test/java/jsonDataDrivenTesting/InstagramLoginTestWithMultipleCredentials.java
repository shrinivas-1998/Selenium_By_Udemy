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

public class InstagramLoginTestWithMultipleCredentials 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Read JSON file
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode jsonNode = objectMapper
				.readTree(new File(System.getProperty("user.dir") + "\\src\\test\\resources\\MultipleTestData.json"));

		for (JsonNode user : jsonNode) 
		{
			String username = user.get("username").asText();
			String password = user.get("password").asText();

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
				System.out.println("Login successful for: " + username);
			} 
			else 
			{
				System.out.println("Login failed for: " + username);
			}
		}
		
		Thread.sleep(4000);
		driver.quit();
	}
}
