package wee3.day1.demos;
import java.util.Date;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class DateDemos {

	public static void main(String a[]) {
	 Date date = new Date();
	 System.out.println(date);
	 
	 LocalDate now = LocalDate.now();
	 
	 System.out.println(now);
	 
	 
	 LocalDateTime dateWithTime = LocalDateTime.now();
	 
	// System.out.println(dateWithTime);
	 
	 DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	 
	 String formattedNow = now.format(dateFormatter);
	 
	 System.out.println(formattedNow);
	
	}
	 
}
