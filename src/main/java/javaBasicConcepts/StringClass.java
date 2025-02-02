package javaBasicConcepts;

public class StringClass 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		// String is an object 
		
		// 1) creating String by using String Literal
		
		String s = "shrinivas";
		String s1 = "shrinivas";
		
		// 2) Creating String by using new keyword 
		
		String s3 = new String("welcome");
		String s4 = new String("welcome to india");
		
		// spliting the String and creating an Array and Accessing the elemnts inside an Array
		
		String[] splitedStringArray = s4.split(" ");
		
		System.out.println(splitedStringArray[0]);
		System.out.println(splitedStringArray[1]);
		System.out.println(splitedStringArray[2]);
		
		//String[] splitedStringArray1 = s4.split("to ");
		String[] splitedStringArray1 = s4.split("to");

		System.out.println(splitedStringArray1[0]);
		System.out.println(splitedStringArray1[1]);
		System.out.println(splitedStringArray1[1].trim());
		
		// printing the strings characters
		System.out.println("");
		System.out.println("Printiong the charaters inside string ");
		for(int i = 0; i<s4.length(); i ++)
		{
			System.out.println(s4.charAt(i));
		}

		System.out.println("");
		
		// Reversing the characters inside the String 
		System.out.println("Reversing the characters inside the String");

		for(int i = s4.length()-1; i>=0; i--)
		{
			System.out.println(s4.charAt(i));
		}
	}
}
