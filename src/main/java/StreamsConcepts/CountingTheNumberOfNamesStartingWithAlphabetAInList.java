package StreamsConcepts;

import java.util.ArrayList;

public class CountingTheNumberOfNamesStartingWithAlphabetAInList 
{
    
	public void regular()
	{
		ArrayList<String> Names = new ArrayList<String>();
		Names.add("Abhay");
		Names.add("Akshay");
		Names.add("Vikas");
		Names.add("Akaay");
		Names.add("Abhishek");
		Names.add("Shrinivas");
		
		int count = 0;
		for(int i=0; i<Names.size(); i++)
		{
			String actual = Names.get(i);
			if(actual.startsWith("A"))
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
