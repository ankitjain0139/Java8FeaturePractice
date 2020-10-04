package demo.multithreading;

public class VolatileFlagDemo {
	
	public static volatile boolean flag = false;
	
	public static void main(String[] args) {
		
		new Thread(() ->{
			for(int i=0; i<100; i++)
			{
				System.out.println("the value of i is :"+i);
			}
			flag = true;
		}).start();
		
		new Thread(() ->{
			int i=1;
			while(!flag)
			{
				++i;
			}
			System.out.println("the value of i in 2nd thread is :"+i);
		}).start();
		
	}

}
