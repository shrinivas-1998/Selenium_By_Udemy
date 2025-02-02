package Exercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableAssignment 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// driver.findElement(By.xpath("//a[text() = 'Practice']")).click();

		// Locate the web table
		WebElement table = driver.findElement(By.id("product"));
		// Get the number of rows
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		int rowCount = rows.size();
		System.out.println("Number of Rows: " + rowCount);

		// Get the number of columns (from the first row)
		List<WebElement> columns = rows.get(0).findElements(By.tagName("th"));
		int columnCount = columns.size();
		System.out.println("Number of columns: " + columnCount);

		// Get all cells from the second row (Index 1, as index starts from 0)
		List<WebElement> secondRowsCells = rows.get(1).findElements(By.tagName("td"));
		
		// Printing the values present in first row
		System.out.print("Values in Second Row: ");
		for (WebElement cell : secondRowsCells) 
		{
			//cell.getText();
			System.out.println(cell.getText() + " | ");
		}

		Thread.sleep(3000);
		driver.quit();
	}
}
