package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakingScreenshot 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/");

		// 1) Capturing full page screenshot
		TakesScreenshot ts = (TakesScreenshot) driver; // for WebDriver driver = new ChromeDriver();
		File Sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File Targetfile = new File(System.getProperty("user.dir") + "\\Screenshots\\CricBuzz.png"); 
	    Files.copy(Sourcefile, Targetfile);

		/*
		 * File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 * FileUtils.copyFile(src, new File("D:\\screenshot\\cricbuzz.png"));
		 */
		

		Thread.sleep(5000);
		driver.quit();
	}
}
