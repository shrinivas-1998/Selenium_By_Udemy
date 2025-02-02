package Exercise;

public class ArrayExcecise 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int[] numbers = { 1, 2, 4, 5, 6, 7 };

		// Printing First element of the numbers array
		System.out.println("First element of an Array : " + numbers[0]);

		// Printing Last element of the numbers array
		System.out.println("First element of an Array : " + numbers[5]);
		System.out.println("Last element: " + numbers[numbers.length - 1]);

		// Loop through the array in reverse order
		for (int i = numbers.length - 1; i >= 0; i--) 
		{
			System.out.println(numbers[i] + " ");
		}

		// Get the total number of elements in the array
		int totalElements = numbers.length;
		System.out.println("Total number of elements in the array: " + totalElements);
	}
}
