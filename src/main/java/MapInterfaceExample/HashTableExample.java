package MapInterfaceExample;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableExample 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();

		// Adding key-value pairs to the HashMap
		hm.put(0, "hello");
		hm.put(1, "GoodBye");
		hm.put(2, "Good Morning");
		hm.put(3, "Evening");
		hm.put(4, "Bye");

		// Accessing values using keys
		System.out.println("Value for key 1: " + hm.get(1));
		System.out.println("Value for key 5 (non-existent): " + hm.get(5)); // Returns null

		// Iterating through the HashMap
		Set<Map.Entry<Integer, String>> sn = hm.entrySet();
		Iterator<Map.Entry<Integer, String>> it = sn.iterator();

		while (it.hasNext()) 
		{
			Map.Entry<Integer, String> mp = it.next();
			System.out.println("Key: " + mp.getKey() + ", Value: " + mp.getValue());
		}
	}
}
