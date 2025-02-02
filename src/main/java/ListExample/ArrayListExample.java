package ListExample;

import java.util.ArrayList;

public class ArrayListExample 
{
	// List can accept duplicate elements or values
	// ArrayList, LinkedList and vector --> implementing List interface
	// Array have fixed size where as ArrayList grow dynamically (it's having
	// dynamic size)
	// you can access and insert any value in any index
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("shrinivas");
		al.add("Kapil");
		al.add("Selenium");
		al.add("python");
		al.add(3, "python");
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		al.add(2, "java");
		System.out.println(al);
		al.remove("python");
		System.out.println(al);
		System.out.println(al.contains("shrinivas"));
		System.out.println(al.get(2));
		System.out.println(al.indexOf("java"));
		System.out.println(al.isEmpty());
		System.out.println(al.size());
	}
}
