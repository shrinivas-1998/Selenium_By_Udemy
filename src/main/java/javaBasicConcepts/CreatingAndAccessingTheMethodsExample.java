package javaBasicConcepts;

public class CreatingAndAccessingTheMethodsExample 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//getData();
		CreatingAndAccessingTheMethodsExample m = new CreatingAndAccessingTheMethodsExample();
		String name =m.getData();
		System.out.println(name);
		
		MethodData2 d = new MethodData2();
	    String names = d.getUserData();
	    System.out.println(names);
	    
	    getMoney();

	}
	
	public String getData()
	{
		System.out.println("Hello World !");
		return "rahul gandhi";
	}
	
	public static void getMoney()
	{
		System.out.println("i want money to buy a car");
	}

}
