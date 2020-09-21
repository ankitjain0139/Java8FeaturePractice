package demo.dateAndTime;

import java.time.LocalDateTime;

public class LocalDateAndTimeClass {
	
	public static void main(String[] args) {
		LocalDateTime dateAndTime = LocalDateTime.now();
		
		int dd = dateAndTime.getDayOfMonth();
		int MM = dateAndTime.getMonthValue();
		int yyyy = dateAndTime.getYear();
		int hh = dateAndTime.getHour();
		int mm = dateAndTime.getMinute();
		int ss = dateAndTime.getSecond();
		int sss = dateAndTime.getNano();
		
		System.out.printf("Date : %d-%d-%d", dd, MM, yyyy);
		System.out.printf("\n Time : %d:%d:%d:%d", hh, mm, ss, sss);

	}

}
