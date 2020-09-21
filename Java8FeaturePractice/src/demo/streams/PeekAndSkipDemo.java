package demo.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PeekAndSkipDemo {

	public static void main(String[] args) {
		
		List<String> stringList = Stream.of("aa", "bb", "cc", "dd").filter(str -> !str.equals("bb"))
				                  .peek(str -> System.out.println("peeked---"+str))
				                  .collect(Collectors.toList());
		System.out.println("==================");
		//below skip(2) will skip first 2 nums
		IntStream.of(1, 13, 14, 5, 33, 10, 8).skip(2)
				                .filter(num -> num>5)
				                .forEach(System.out :: println);
				                
	}

}
