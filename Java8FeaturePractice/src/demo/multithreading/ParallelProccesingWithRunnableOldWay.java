package demo.multithreading;

import java.util.stream.IntStream;

public class ParallelProccesingWithRunnableOldWay {
	
	public static int[] numbers = IntStream.rangeClosed(0, 1000).toArray();
	public static int actualResult = IntStream.rangeClosed(0, 1000).sum();
	
	static int sum=0;
	
	public static void addNums(int num)
	{
		sum = sum + num;
	}
	
	public static void main(String[] args) throws InterruptedException{
		
		WorkerParallel1 parallel1 = new WorkerParallel1(numbers);
		WorkerParallel2 parallel2 = new WorkerParallel2(numbers);
		
		Thread t1 = new Thread(parallel1);
		Thread t2 = new Thread(parallel2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Sum using Runnable : "+sum);
		System.out.println("Sum using Instream : "+actualResult);
		
	}

}
