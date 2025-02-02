package UploadingFileByUsingAutoIT;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DownLoadingTheConvertedFile 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		// Maximize the browser window
		driver.manage().window().maximize();

		// Navigate to the PDF to Word conversion website
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		Thread.sleep(3000);

		// Click on the file upload button
		driver.findElement(By.xpath("//a[@id='pickfiles']")).click();
		Thread.sleep(5000);

		// Execute the AutoIt script to upload a file
		Runtime.getRuntime().exec("C:\\Users\\HP\\AutoITCHECK\\FileUpload.exe");

		// Wait until the process button becomes visible
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#processTask")));
		driver.findElement(By.cssSelector("#processTask")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#download")));
		driver.findElement(By.cssSelector("#download")).click();

		File file = new File("C:\\Users\\HP\\Downloads\\Niraj_Shende.docx");
		if (file.exists()) 
		{
			System.out.println("Excel File Found");
		}
		
		Thread.sleep(4000);
		driver.quit();
	}
}
