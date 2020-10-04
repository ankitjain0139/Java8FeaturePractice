package demo.oops;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
	public static void main(String[] args) {
		
		StringTokenizer tokenizer = new StringTokenizer("My Name is Lakhan.");
		
		while (tokenizer.hasMoreElements()) {
			System.out.println(tokenizer.nextElement());
		}
	}

}
