package demo.streams;

public class Exa1 {
	
	public static void print(int num)
	{
		if(num>0)
		{
			print(num-1);
		System.out.println(num);
		
		}
	}

	public static void main(String[] args) {

		print(50);
		
	}

}
