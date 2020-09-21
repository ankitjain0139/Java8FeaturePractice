package demo.dateAndTime;

import java.time.Year;
import java.util.Scanner;

public class LeapYearCheck {
	public static void main(String[] args) {
		System.out.println("Enter the Year....");
		Scanner scr = new Scanner(System.in);
		
		Integer yearSelected = scr.nextInt();
		
		Year year = Year.of(yearSelected);
		
		if(year.isLeap())
			System.out.printf("%d is Leap Year..",yearSelected);
		else
			System.out.printf("%d is not a Leap Year..",yearSelected);
	}
}
