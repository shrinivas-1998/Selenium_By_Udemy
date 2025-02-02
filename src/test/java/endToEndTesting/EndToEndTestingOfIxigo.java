package endToEndTesting;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndToEndTestingOfIxigo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
				// driver.get("https://www.spicejet.com/");
				driver.get("https://www.ixigo.com/");

	}

}
