package exceptionHandling;

public class ExceptionWithfinallyBlock 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a = 7;
		int b = 0;

		// int d = a/b;
		// System.out.println(d);

		try 
		{
			int c = a / b;
			System.out.println(c);
		} 
		catch (ArithmeticException ae) 
		{
			System.out.println("ArithmeticException is handled");
		} 
		catch (IndexOutOfBoundsException ibe) 
		{
			System.out.println("IndexOutOfBoundsException is handled");
		} 
		catch (Exception e) 
		{
			System.out.println("Exception is handled");
		} 
		finally 
		{
			// Irrespective of any situation whether the exception is occurred or not
			// finally block will get executed
			System.out.println("cookies deleted and finally block gets executed");
		}
	}
}
