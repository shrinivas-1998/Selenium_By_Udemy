package DateClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDateAndTime 
{
	public static void main(String[] args) 
	{
		// Display the current date and time in different formats

		// Create a Date object representing the current date and time
		Date currentDate = new Date();

		// Define a format for displaying only the date
		SimpleDateFormat dateFormat = new SimpleDateFormat("M/d/YYYY");

		// Define a format for displaying the date and time
		SimpleDateFormat dateTimeFormat = new SimpleDateFormat("M/d/YYYY hh:mm:ss");

		// Format the current date and time
		String formattedDate = dateFormat.format(currentDate);
		String formattedDateTime = dateTimeFormat.format(currentDate);

		// Print the formatted date and time
		System.out.println("Current Date: " + formattedDate);
		System.out.println("Current Date and Time: " + formattedDateTime);

		// Print the default string representation of the Date object
		System.out.println("Default Date Format: " + currentDate.toString());
	}
}
