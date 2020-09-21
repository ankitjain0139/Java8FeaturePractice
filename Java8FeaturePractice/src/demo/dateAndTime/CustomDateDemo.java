package demo.dateAndTime;

import java.time.LocalDateTime;
import java.time.Month;

public class CustomDateDemo {
	public static void main(String[] args) {
		
		LocalDateTime customDate = LocalDateTime.of(2019, Month.MAY, 30, 11, 35);
		System.out.println(customDate);
		System.out.println("After 6  months = "+customDate.plusMonths(6));
		System.out.println("Before 6 months = "+customDate.minusMonths(6));
	}
}
