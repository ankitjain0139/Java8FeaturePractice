package demo.stringInterview;

public class DistinctChars {
	
	static void distinctString(String str)
	{
		int[] intArr = new int[str.length()];
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) != ' ')
			{
				intArr[str.charAt(i)]++;
			}
		}
	}
	
	public static void main(String[] args) {
			}

}
