package Constructor;

public class ConstructorDemo 
{
	public ConstructorDemo() 
	{
		// Constructor does not have return type
		// name of constructor should be same as class name
		System.out.println("I am in the constructor");
		System.out.println("I am in the constructor lecture one");

	}

	public void getData() 
	{
		System.out.println("i am in the getData method");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ConstructorDemo cd = new ConstructorDemo();
	}
}
