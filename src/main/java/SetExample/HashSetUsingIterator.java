package SetExample;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetUsingIterator 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();

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

		Iterator<String> it = hs.iterator();
		while (it.hasNext()) 
		{
			System.out.println(it.next());
		}
	}
}
