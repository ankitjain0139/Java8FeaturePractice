package demo.streams;

import java.util.stream.Stream;

public class StreamOfDemo {

	public static void main(String[] args) {

		Double[] dbl = {1.1, 1.2, 2.2, 3.3};
		Stream<Double> str = Stream.of(dbl);
		
		
		
		str.forEach(System.out :: println);
	}

}
