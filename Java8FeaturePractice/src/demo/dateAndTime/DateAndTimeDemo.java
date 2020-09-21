package demo.dateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateAndTimeDemo {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println("current date--"+date);
		
		LocalTime time = LocalTime.now();
		System.out.println("current time--"+time);

	}

}
