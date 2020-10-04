package demo.multithreading;

import java.util.stream.IntStream;

public class ParallelProccesingWithLambdaSynchronized {
	public static int[] numbers = IntStream.rangeClosed(0, 1000).toArray();
	public static int actualResult = IntStream.rangeClosed(0, 1000).sum();
	
	static int sum=0;
	
	public synchronized static void addNums(int num)
	{
		sum = sum + num;
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread thread1 = new Thread( () -> {
			for(int i=0; i<numbers.length/2; i++)
			{
				addNums(numbers[i]);
			}
		});
		
		Thread thread2 = new Thread( () -> {
			for(int i=numbers.length/2; i<numbers.length; i++)
			{
				addNums(numbers[i]);
			}
		});
		
		thread1.start();
		thread2.start();
		
		thread1.join();
		thread2.join();
		
		System.out.println("Sum using Parallel processing Synchronized: "+sum);
		System.out.println("Sum using Instream : "+actualResult);
	}


}
