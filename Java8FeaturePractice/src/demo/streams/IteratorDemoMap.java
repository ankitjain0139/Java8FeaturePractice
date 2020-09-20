package demo.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IteratorDemoMap {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8);
		System.out.println("full list---"+list);
		
		List<Integer> newList = list.stream().map(l -> l*2).collect(Collectors.toList());

		System.out.println("even list---"+newList);
	}
}
