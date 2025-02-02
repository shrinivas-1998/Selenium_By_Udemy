package methodOverloading;

// function overriding : Either argument count should be different or argument data type should be different 

public class FunctionOrMethodOverloading 
{
	public void getData(int a) 
	{
		System.out.println(a);
	}

	public void getData(String a) 
	{
		System.out.println(a);
	}

	public void getData(int a, int b) 
	{
		System.out.println(b);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FunctionOrMethodOverloading fo = new FunctionOrMethodOverloading();
		fo.getData(2);
		fo.getData("Hello");
		fo.getData(10, 100);
	}
}
