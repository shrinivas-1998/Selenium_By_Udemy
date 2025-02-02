package Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayExceciseUsingStreams 
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

		// Convert array to List, reverse it, and print using Streams
		List<Integer> List = Arrays.stream(numbers).boxed() // Use .boxed() to convert "int" values to Integer (since
															// Streams for primitive types don't support reversing).
				.collect(Collectors.toList());

		Collections.reverse(List);
		List.forEach(num -> System.out.println(num + " "));

		// Calculate total elements using Java Streams
		long count = Arrays.stream(numbers).count();

		System.out.println("Total number of elements in the array: " + count);
	}
}
