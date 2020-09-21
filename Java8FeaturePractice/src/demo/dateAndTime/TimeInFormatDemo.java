package demo.dateAndTime;

import java.time.LocalTime;

public class TimeInFormatDemo {

	public static void main(String[] args) {
		
		LocalTime time = LocalTime.now();
		
		int hh = time.getHour();
		int mm = time.getMinute();
		int ss = time.getSecond();
		int sss = time.getNano();
		
		System.out.printf("%d:%d:%d:%d", hh, mm, ss, sss);

	}

}
