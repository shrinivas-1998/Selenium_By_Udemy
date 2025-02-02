package UploadingFileByUsingAutoIT;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DownLoadingTheConvertedFileAndSettingUpForAllBrowsers 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		// TODO Auto-generated method stub
		String downloadPath = System.getProperty("user.dir");

		// Set up Chrome preferences for file download
		HashMap<String, Object> chromePrefs = new HashMap<>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadPath);

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);

		// Initialize WebDriver
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
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

		// Wait until the download button becomes visible
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#download")));
		driver.findElement(By.cssSelector("#download")).click();

		// Verify if the downloaded file exists
		File file = new File(downloadPath + "\\Niraj_Shende.docx");
		if (file.exists()) 
		{
			Assert.assertTrue(file.exists());
			System.out.println("Excel File Found");
			if (file.delete()) 
			{
				System.out.println("File Deleted");
			}
		}

		Thread.sleep(4000);
		driver.quit();
	}
}
