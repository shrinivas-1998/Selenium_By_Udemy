package StaticAndNonStaticKeyword;

public class StaticVaiables 
{
	String name; // instance variables
	String address;
	static String city; // static variables[class variables]
	static int i; // static variables are shared by each object

	static // static block for initializing static variables
	{
		city = "pune";
		i = 5;
	}

	// all static variables called as class variables
	// the variables declared in constructor called as local variables
	// all class level declared variables called as instance variables

	public StaticVaiables(String name, String address) 
	{
		this.name = name; // local variables
		this.address = address;
		i++;
		System.out.println(i);
	}

	public void getAddress() 
	{
		System.out.println(address + " " + city);
	}

	public static void getCity() 
	{
		// only static variables are accessible in static method
		System.out.println(city);
	}

	public static void main(String[] args) 
	{
		StaticVaiables sv = new StaticVaiables("Shrinivas", "Wakad");
		StaticVaiables sv1 = new StaticVaiables("Shrinivas", "shivaji nagar");
		sv.getAddress();
		sv1.getAddress();
		// we can call static method by using class name
		StaticVaiables.getCity();
		StaticVaiables.i = 4;
		sv.address = "kharadi";
	}
}
