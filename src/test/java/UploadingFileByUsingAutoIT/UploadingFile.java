package UploadingFileByUsingAutoIT;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadingFile 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id = 'pickfiles']")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\HP\\AutoITCHECK\\FileUpload.exe");
		Thread.sleep(5000);
		driver.quit();
	}
}
