package Arrays;

public class PrintingLargestNumberFrom3Into3Matrix 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// Initialize the 3x3 matrix
		int abc[][] = { { 2, 4, 5 }, { 3, 4, 7 }, { 1, 2, 9 } };

		// Initialize max with the first element of the matrix
		int max = abc[0][0];

		// Traverse the matrix to find the largest number
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				if (abc[i][j] > max) 
				{
					max = abc[i][j];
				}
			}
		}
		// Print the largest number
		System.out.println("The largest number in the 3x3 matrix is: " + max);
	}
}
