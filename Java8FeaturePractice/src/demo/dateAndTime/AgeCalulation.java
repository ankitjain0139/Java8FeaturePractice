package demo.dateAndTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class AgeCalulation {
	
	public static void main(String[] args) {
		
		LocalDate birthDate = LocalDate.of(1989, Month.JUNE, 30);
		LocalDate todayDate = LocalDate.now();
		Period period = Period.between(birthDate, todayDate); 
		
		System.out.printf("Your age is %d Years %d Months %d Days", period.getYears(), 
				period.getMonths(), period.getDays());
	}

}
