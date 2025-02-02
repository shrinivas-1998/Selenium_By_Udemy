package Arrays;

import java.util.ArrayList;

public class PrintingUniqueNumberFromAnArray 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		// Array of numbers
		int a[] = { 4, 5, 5, 5, 4, 6, 6, 9, 4, 5, 6, 7,7 }; // Print unique number from the list - Amazon

		// ArrayList to keep track of processed numbers
		ArrayList<Integer> ab = new ArrayList<Integer>();

		// Iterate through the array
		for (int i = 0; i < a.length; i++) 
		{
			int k = 0;

			// Check if the number is already processed
			if (!ab.contains(a[i]))
			{
				ab.add(a[i]);
				k++;

				// Count occurrences of the number
				for (int j =i + 1; j < a.length; j++) 
				{
					if (a[i] == a[j]) 
					{
						k++;
					}
				}
				
				System.out.println(a[i]);
				System.out.println(k);
				// If the number is unique, print it
				if (k == 1) 
				{
					System.out.println(a[i] + " is a unique number");
				}
			}
		}
	}
}
