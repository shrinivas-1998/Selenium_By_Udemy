package nestedForLoop;

public class AnotherPattern 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// int k = 1;
		for (int i = 1; i < 5; i++) 
		{
			for (int j = 1; j <= i; j++) 
			{
				System.out.print(j);
				System.out.print("\t");
				// k++;
			}
			System.out.println("");
		}
	}
}
// 1	
// 1	2	
// 1	2	3	
// 1	2	3	4
