package assignment_23_Nov_2022;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Que4_getTuesday {
//How Will You Get Next Tuesday Using Java8?
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		  DayOfWeek dayOfWeek = now.plusDays(5).getDayOfWeek();
		System.out.println(dayOfWeek);
	}
}
