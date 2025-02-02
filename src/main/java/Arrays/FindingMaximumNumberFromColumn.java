package Arrays;

public class FindingMaximumNumberFromColumn 
{
	// 2 4 5
	// 3 0 7
	// 1 2 9
	// step1 : find the minimum number
	// step2 : identify the column of minimum number
	// step3 : find the maximum number in identified column

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int abc[][] = { { 2, 4, 5 }, { 3, 0, 7 }, { 1, 2, 9 } };
		int min = abc[0][0];
		int mincolumn = 0;
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				if (abc[i][j] < min) 
				{
					min = abc[i][j];
					mincolumn = j;
				}
			}
		}

		int max = abc[0][mincolumn];
		int k = 0;
		while (k < 3) 
		{
			if (abc[k][mincolumn] > max) 
			{
				max = abc[k][mincolumn];
			}
			k++;
		}
		System.out.println(max);
	}
}
