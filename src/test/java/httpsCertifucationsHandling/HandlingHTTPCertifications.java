package httpsCertifucationsHandling;

import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HandlingHTTPCertifications 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		// for firefox browser
		FirefoxOptions options1 = new FirefoxOptions(); 
		// for Edge browser
		EdgeOptions options2 = new EdgeOptions();
		
		// Code for using proxy
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipaddress : 11111");
		options.setCapability("Proxy", proxy);
		
		// Code for preference 
		Map<String , Object> preference = new HashMap<String , Object>();
		preference.put("download.default_directory", "directory/path");
		
		// handling Blocking Popup coming on webapage 
		//ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",
		Arrays.asList("disable-popup-blocking"));
		
		options.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://expired.badssl.com/");
		
		// Getting Title of webpage
		System.out.println(driver.getTitle());
		
		Thread.sleep(5000);
		driver.quit();
	}
}
