package javaBasicConcepts;

public class DecisionMakingStatementsExample 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
		
		// Logic for checking whether the given number is even number or odd number 
		
		for(int i= 0; i<arr.length; i++)
		{
			if (arr[i] % 2 ==0)
			{
				System.out.println(arr[i] + " is an even number");
			}
			else 
			{
				System.out.println("It is odd number");
			}
		}
	}
}
