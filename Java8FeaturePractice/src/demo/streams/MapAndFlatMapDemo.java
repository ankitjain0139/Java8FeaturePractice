package demo.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapAndFlatMapDemo {

	public static void main(String[] args) {
		
		Map<String, List<Integer>> namesAndNums = new HashMap<>();
		namesAndNums.put("Ram", Arrays.asList(11,22,33));
		namesAndNums.put("Shyam", Arrays.asList(44,55));
		namesAndNums.put("Mohan", Arrays.asList(66,77,88));
		namesAndNums.put("Sohan", Arrays.asList(19,28,87));
		
		List<Stream<Integer>> numsUsingMap = namesAndNums.values().stream().map(Collection :: stream).collect(Collectors.toList());
		for(Stream<Integer> nums : numsUsingMap)
		{
			List<Integer> phoneNumbers = nums.collect(Collectors.toList());
			System.out.println("using map--"+phoneNumbers);
		}
		
		// phoneNums.stream().forEach(nums -> nums.forEach(System.out :: println));
		System.out.println("===================");
		
		List<Integer> numsUsingFlatMap = namesAndNums.values().stream().flatMap(Collection :: stream).collect(Collectors.toList());
		System.out.println("using flat map---");
		numsUsingFlatMap.forEach(System.out :: println);

	}

}
