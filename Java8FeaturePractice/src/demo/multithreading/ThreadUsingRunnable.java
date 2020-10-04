package demo.multithreading;

public class ThreadUsingRunnable {
	public static void main(String[] args) {
		
		//1st way
		Runnable runnable = () -> {
			int sum=0;
			for(int i=0; i<5; i++)
				sum += i;
			System.out.println("sum using lambda :"+sum);
		};
		new Thread(runnable).start();
		
		//2nd way
		new Thread(() ->  {
			int sum=0;
			for(int i=0; i<5; i++)
				sum += i;
			System.out.println("sum using lambda more concise :"+sum);
		}).start();  
	}
}
