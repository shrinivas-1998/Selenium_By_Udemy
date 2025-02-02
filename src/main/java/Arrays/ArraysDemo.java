package Arrays;

public class ArraysDemo 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// Arrays : it is a container which contains multiple values of same data type
		int a[] = new int[5]; // Declares an array and allocates memory for the values
		a[0] = 2;
		a[1] = 4;
		a[2] = 6;
		a[3] = 8;
		a[4] = 10; // Initialized values of that Array

		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]); // Retrieve the values present in that array 
		}
	}
}
