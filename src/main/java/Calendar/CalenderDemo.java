package Calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderDemo 
{
	public static void main(String[] args) 
	{
		// Create an instance of Calendar
		Calendar cal = Calendar.getInstance();

		// Format and display the current date and time
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/YYYY hh:mm:ss");
		System.out.println("Formatted Date and Time: " + sdf.format(cal.getTime()));

		// Display individual calendar fields (e.g., Year, Month, Day)
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1; // Adding 1 because months are 0-based
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);

		System.out.println("Year: " + year);
		System.out.println("Month: " + month);
		System.out.println("Day: " + day);
		System.out.println("Hour: " + hour);
		System.out.println("Minute: " + minute);
		System.out.println("Second: " + second);
		System.out.println("Day Of The Week: " + dayOfWeek);
	}
}
