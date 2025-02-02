package Arrays;

public class WaysOfDeclaringMultiDiamensionalArray 
{
	public static void main(String[] args) 
	{
		// a[row] [column]---> matrix(2*3)
		// 2 4 5
		// 3 4 7

		int a[][] = new int[2][3];
		a[0][0] = 2;
		a[0][1] = 4;
		a[0][2] = 5;
		a[1][0] = 3;
		a[1][1] = 4;
		a[1][2] = 7;

		System.out.println(a[1][0]);

		int b[][] = { { 2, 4, 5 }, { 3, 4, 7 } };
		System.out.println(b[1][0]);
	}
}
