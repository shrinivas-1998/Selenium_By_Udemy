package javaBasicConcepts;

import java.util.ArrayList;

public class ArrayListExample 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ArrayList<String> studentName = new ArrayList<>();
		studentName.add("rahul");
		studentName.add("ram");
		studentName.add("shrinivas");
		studentName.add("vivek");
		
		System.out.println("ArrayList : "+studentName);
		
		studentName.remove(0);
		
		System.out.println("After removing rahul : " + studentName);
		
		studentName.add("shalu");
		
		System.out.println("After adding shalu : "+studentName);
		
		System.out.println(studentName.get(3));
		
		// printing the elements from the ArrayList
		
		System.out.println("printing the elements from the ArrayList");
		
		for(int i = 0; i<studentName.size(); i++)
		{
			System.out.println(studentName.get(i));
		}
		
		System.out.println("By using enhanced for loop");
		
		for(String name:studentName)
		{
			System.out.println(name);
		}
		
		if(studentName.contains("shrinivas"))
		{
			System.out.println("given student name is presnt in ArrayList");
		}
		else
		{
			System.out.println("given student name is not presnt in ArrayList");
		}
	}
}
