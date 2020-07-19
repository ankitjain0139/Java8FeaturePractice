package demo.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class StreamsExe1 {
	
	public static void main(String[] args) {
		
		Stream<Integer> s1 = Stream.of(1,2,3,4,5,6);
	//	s1.forEach(p -> System.out.println(p));
		
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(11);
		l.add(12);
		l.add(13);
		l.add(14);
		l.add(15);
		
		System.out.println("before = "+l);
		
		l.forEach(action -> {
			System.out.println("after.."+action);
		});
		

	}

}
