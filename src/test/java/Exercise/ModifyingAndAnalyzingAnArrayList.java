package Exercise;

import java.util.ArrayList;

public class ModifyingAndAnalyzingAnArrayList 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// Create an ArrayList of Strings
		ArrayList<String> a = new ArrayList<>();

		// Add elements to the ArrayList (including duplicates)
		a.add("apple");
		a.add("banana");
		a.add("cherry");
		a.add("mango");
		a.add("apple"); // Duplicate element

		// Print the ArrayList
		System.out.println("ArrayList elements: " + a);

		// Remove the first occurrence of "apple"
		a.remove("apple");

		// Print the ArrayList after removal
		System.out.println("ArrayList after removing first 'apple': " + a);

		// Check if "orange" is in the ArrayList
		if (a.contains("orange")) 
		{
			System.out.println("The ArrayList contains 'orange'.");
		} 
		else 
		{
			System.out.println("The ArrayList does NOT contain 'orange'.");
		}

		// Print the size of the ArrayList
		System.out.println("Size of ArrayList: " + a.size());

		// Loop through the ArrayList and print index & value
		System.out.println("ArrayList elements:");
		for (int i = 0; i < a.size(); i++) 
		{
			System.out.println("Index " + i + ": " + a.get(i));
		}
	}
}
