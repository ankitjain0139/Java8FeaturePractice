package demo.stringInterview;

import java.util.HashSet;
import java.util.Set;

public class UniqueStringChars {
	public static void main(String[] args) {
		String str = "aabbbcccddd";
		char[] chars = str.toCharArray();
		System.out.println("Non-Unique chars :"+str);
		Set<Character> charSet = new HashSet<>();
		for(char eachChar :chars)
		{
			charSet.add(eachChar);
		}
		System.out.println("Unique Set :"+charSet);
		String newStr="";
		for(Character newSet : charSet)
		{
			newStr = newStr + newSet;
		}
		System.out.println("Unique String :"+newStr);
		
	}

}
