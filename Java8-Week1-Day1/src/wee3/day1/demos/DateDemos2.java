package wee3.day1.demos;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class DateDemos2 {

	public static void main(String[] args) {
		
		LocalDateTime dateTime =  LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES); //till what you want to truncate
		
		System.out.println(dateTime);
		
		ZonedDateTime now = LocalDateTime.now()
		                                 .plusHours(1)
		                                 .with(TemporalAdjusters.next(DayOfWeek.SATURDAY))
		                                 //.atZone(ZoneId.of("Europe/Paris"));
		                                 .atZone(ZoneId.of("Asia/Calcutta"));
		
		System.out.println(now);

	}

}
