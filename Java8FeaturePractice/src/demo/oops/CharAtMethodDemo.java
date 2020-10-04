package demo.oops;

public class CharAtMethodDemo {
	public static void main(String[] args) {
		String str = "My name is lakhan.";
	//	char[] charArray = str.toCharArray();
		
		for(int i=0; i<str.length(); i++)
		{
			if(i%2 != 0 && str.charAt(i) != ' ')
			{
				System.out.println("char at "+i+ " possision is "+str.charAt(i));
			}
		}
	}

}
