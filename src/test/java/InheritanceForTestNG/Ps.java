package InheritanceForTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Ps 
{
	public void DoThis() 
	{
		System.out.println("I am here");
	}

	@BeforeMethod
	public void beforeRun() 
	{
		System.out.println("Run me First");
	}

	@AfterMethod
	public void afterRun() 
	{
		System.out.println("Run me Last");
	}
}
