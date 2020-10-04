package demo.multithreading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class ThreadUsingCallable {
	public static int[] numbers = IntStream.rangeClosed(0, 1000).toArray();
	public static int actualResult = IntStream.rangeClosed(0, 1000).sum(); 
	
	public static void main(String[] args) {
		
		Callable<Integer> callable1 = () -> {
			int sum=0;
			for(int i=0; i<numbers.length/2; i++)
			{
				sum = sum + numbers[i];
			}
			return sum;
		};
		
		Callable<Integer> callable2 = () -> {
			int sum=0;
			for(int i=numbers.length/2; i<numbers.length; i++)
			{
				sum = sum + numbers[i];
			}
			return sum;
		};
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		List<Callable<Integer>> tasks = Arrays.asList(callable1, callable2);
		try {
			List<Future<Integer>> results = executorService.invokeAll(tasks);
			
			int k=0;
			int sum=0;
			for(Future<Integer> result : results)
			{
				sum = sum + result.get();
				System.out.println("The sum of " + ++k + " is "+result.get());
			}
			
			System.out.println("The sum from callable is :"+sum);
			System.out.println("The sum from Intstram is :"+actualResult);
			
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		executorService.shutdown();
	}

}
