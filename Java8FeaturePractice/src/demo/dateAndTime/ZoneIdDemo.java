package demo.dateAndTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneIdDemo {
	public static void main(String[] args) {
		ZoneId defaultZone = ZoneId.systemDefault();
		System.out.println(defaultZone);
		
		ZoneId losAngeleszone = ZoneId.of("America/Los_Angeles");
		ZonedDateTime laZoneTime = ZonedDateTime.now(losAngeleszone);
		System.out.println(laZoneTime);
	}

}
