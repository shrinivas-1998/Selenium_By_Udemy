package InheritanceForTestNG;

import org.testng.annotations.Test;

public class PS1 extends Ps 
{
	@Test
	public void Run() 
	{
		int a = 3;
		PS2 ps2 = new PS2(3); // Parameterized Constructor
		DoThis();
		System.out.println(ps2.increment());
		System.out.println(ps2.decrement());

		PS3 ps3 = new PS3(3); // Parameterized Constructor
		System.out.println(ps3.MultipleTwo());
		System.out.println(ps3.MultipleThree());

		// This is correct but i want to access the variables from PS3 class by using
		// ps2 reference variable and we can
		// achieve this by using super() keyword

		System.out.println(ps2.MultipleTwo());
		System.out.println(ps2.MultipleThree());
	}
}
