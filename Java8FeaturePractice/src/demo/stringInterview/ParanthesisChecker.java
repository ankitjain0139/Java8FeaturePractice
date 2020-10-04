package demo.stringInterview;

import java.util.Stack;

public class ParanthesisChecker {
	
	public static void main(String[] args) {
		
		String str = "{([])}";
		Stack<Character> charStack = new Stack<>();
		
		for(int i=0; i<str.length(); i++)
		{
			char eachChar = str.charAt(i);
			if(charStack.isEmpty())
			{
				charStack.push(eachChar);
			}
			if(eachChar == '{' ||  eachChar == '(' || eachChar == '[') 
			{
				charStack.push(eachChar);
			}
			else if(eachChar == '}' && charStack.peek() == '{')
			{
				charStack.pop();
			}
			else if(eachChar == ']' && charStack.peek() == '[')
			{
				charStack.pop();
			}
			else if(eachChar == ')' && charStack.peek() == '(')
			{
				charStack.pop();
			}
		}
		if(charStack.isEmpty())
		{
			
		}
	}

}
