package finalKeyword;

public class finalKeywordAndMethodAndClass 
{
	final void getData() 
	{
		System.out.println("This is a final method");
	}

	/*
	 * public void getData() { // once you declare the method as final ///then we
	 * can not use that method again or modify that method again }
	 */

	// note: Once you declare a class as final then we are not able to inherit that
	// class
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		finalKeywordAndMethodAndClass fk = new finalKeywordAndMethodAndClass();
		fk.getData();
		final int i = 5;
		// int i = 6; // we can not modify i variable once you declare it as final
		System.out.println(i);
	}
}
