package nestedForLoop;

public class NestedForLoopWorking 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// Outer for loop (get executed for 4 times)
		for (int i = 1; i <= 4; i++) 
		{
			System.out.println("Outer loop started");

			// Inner for loop (get executed for 16 times)
			for (int j = 1; j <= 4; j++) 
			{
				System.out.println("Inner loop");
			}
			System.out.println("Outer loop finished");
		}
	}
}
