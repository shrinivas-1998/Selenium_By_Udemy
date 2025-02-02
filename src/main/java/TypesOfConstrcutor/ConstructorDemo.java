package TypesOfConstrcutor;

public class ConstructorDemo 
{
	// Default Constructor
	public ConstructorDemo() 
	{
		// Constructor does not have return type
		// name of constructor should be same as class name
		System.out.println("I am in the constructor");
		System.out.println("I am in the constructor lecture one");
	}

	// Parameterized constructor1
	public ConstructorDemo(int a, int b) 
	{
		// Constructor does not have return type
		// name of constructor should be same as class name
		System.out.println("I am in the parameterized constructor");
		int c = a + b;
		System.out.println(c);
	}
	
	// Parameterized constructor2
	public ConstructorDemo(String name, String surname) 
	{
		// Constructor does not have return type
		// name of constructor should be same as class name
		System.out.println("I am in the parameterized constructor2");
		System.out.println(name + " " + surname);
	}

	public void getData() 
	{
		System.out.println("i am in the getData method");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ConstructorDemo cd = new ConstructorDemo();
		ConstructorDemo cd1 = new ConstructorDemo(10, 20);
		ConstructorDemo cd2 = new ConstructorDemo("Shrinivas", "Bodhale");
	}
}
