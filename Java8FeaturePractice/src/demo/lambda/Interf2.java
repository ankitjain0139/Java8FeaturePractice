package demo.lambda;

interface InterfDemo{
	
  public void add(int a, int b);
  
}

class TestDemo{
	
	public static void main(String[] args) {
		
		InterfDemo i = (a,b) -> System.out.println("Addition from Labda Exp..."+(a+b));
		i.add(5,6);
	}
}