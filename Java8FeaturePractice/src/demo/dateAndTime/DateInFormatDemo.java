package demo.dateAndTime;

import java.time.LocalDate;

public class DateInFormatDemo {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		
		int dd = date.getDayOfMonth();
		int MM = date.getMonthValue();
		int yyyy = date.getYear();
		
		System.out.println(dd+"..."+MM+"..."+yyyy);
		System.out.printf("%d-%d-%d", dd, MM, yyyy);

	}

}
