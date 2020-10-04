package demo.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class CountDownLatchDemo {
	
	private static int[] nums = IntStream.rangeClosed(0, 1000).toArray();
	private static int actualCount = IntStream.rangeClosed(0, 1000).sum();
	
	private static CountDownLatch countDownLatch = new CountDownLatch(2);
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		Callable<Integer> callable1 = () -> {
			int sum=0;
			for(int i=0; i<nums.length/2; i++)
				sum =sum + nums[i];
			countDownLatch.countDown();
			return sum;
		};
		
		Callable<Integer> callable2 = () -> {
			int sum=0;
			for(int i=nums.length/2; i<nums.length; i++)
				sum =sum + nums[i];
			countDownLatch.countDown();
			return sum;
		};
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		Future<Integer> sum1 = service.submit(callable1);
		Future<Integer> sum2 = service.submit(callable2);
		
		System.out.println("Count of Latch before await : "+countDownLatch.getCount());
		countDownLatch.await();
		System.out.println("Count of Latch after await : "+countDownLatch.getCount());
		
		int sum = sum1.get() + sum2.get();
		
		System.out.println("sum from threads :"+sum);
		System.out.println("sum from Intstream :"+actualCount);
		
	}

}
