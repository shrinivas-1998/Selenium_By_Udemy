package thisKeyword;

public class thisDemo 
{
	int a = 3;

	public void getData() 
	{
		int a = 7;
		System.out.println(a);
		System.out.println(this.a); // this refers to current object --> object scope lies in class level
		int c = a + this.a;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisDemo td = new thisDemo();
		td.getData();
	}
}
