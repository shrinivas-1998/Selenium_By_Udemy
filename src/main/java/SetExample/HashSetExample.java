package SetExample;

import java.util.HashSet;

public class HashSetExample 
{
	// HashSet, TreeSet and LinkedHashSet implements to Set interface
	// does not accept duplicate values
	// There is no guarantee elements stored in sequential order.
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();

		// Adding elements to the HashSet
		hs.add("India");
		hs.add("USA");
		hs.add("Nepal");
		hs.add("USA"); // Duplicate element

		// Printing the HashSet
		System.out.println(hs);
		hs.remove("Nepal");

		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		hs.add("Australia");
		System.out.println(hs);
	}
}
