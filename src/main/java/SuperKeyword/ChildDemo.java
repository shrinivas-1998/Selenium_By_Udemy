package SuperKeyword;

public class ChildDemo extends ParentDemo 
{
	String name = "Kapil";

	public ChildDemo() 
	{
		super(); // This should be always a first line in code whenever you are calling parent class constructor
		System.out.println("This is child class constructor");
	}

	public void getData() 
	{
		super.getData();
		System.out.println("This is child class method");
	}

	public void getStringData() 
	{
		System.out.println(super.name);
		System.out.println(name);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ChildDemo cd = new ChildDemo();
		cd.getStringData();
		cd.getData();
	}
}
