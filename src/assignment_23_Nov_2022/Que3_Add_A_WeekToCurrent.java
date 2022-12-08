package assignment_23_Nov_2022;

import java.time.LocalDate;


public class Que3_Add_A_WeekToCurrent {
//How Will You Add 1 Week To Current Date Using Local Datetime Api Of Java8?
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate weeks = now.plusWeeks(1);
		System.out.println(weeks);
		
	}
}
