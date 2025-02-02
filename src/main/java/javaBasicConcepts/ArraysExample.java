package javaBasicConcepts;

public class ArraysExample 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		// Creating an Array
		
		int[] arr = new int[4];
		
		arr[0] = 1;
		arr[1] = 3;
		arr[2] = 5;
		arr[3] = 7;
	
		System.out.println("printing values of Array");
		System.out.println(arr[0]);
		
		// Printing an Array values by using for loop 
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
       
		// Creating an Array
		int[] arr2 = {2,4,6,8};
		
		System.out.println("printing values of Array2");
		
		System.out.println(arr2[0]);
		
		// Printing an Array2 values by using for loop (arr.length - 4)
		for(int i = 0; i<arr2.length; i++)
		{
			System.out.println( arr2[i]);
		}
		
		// printing name string values 
		
		System.out.println("printing name string values");
		
		String[] name = {"Kapil", "Bodhale", "Wiremen"};
		
		for(int i = 0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
		
		// By using for each loop or enhanced for loop 
		
		System.out.println("By using for each loop or enhanced for loop ");
		
		for( String names:name)
		{
			System.out.println(names);
		}
	}
}
