package apliccation;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class Datas {

	public static void main(String[] args) {
		// https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20t01:30:26");
		Instant d06 = Instant.parse("2022-07-20t01:30:26Z");
		
		LocalDate pastweekLocalDate = d04.minusDays(7);
		LocalDate nextweekLocalDate = d04.plusDays(7);
		
		System.out.println(pastweekLocalDate);
		System.out.println(nextweekLocalDate);
		
		LocalDateTime pastweekLocalDateTime = d05.minusDays(7);
		LocalDateTime nexttweekLocalDateTime = d05.plusDays(7);
		
		System.out.println(pastweekLocalDateTime);
		System.out.println(nextweekLocalDate);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println(pastWeekInstant);
		System.out.println(nextWeekInstant);
	}

}
