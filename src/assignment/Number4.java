package assignment;

import java.util.Arrays;
import java.util.LinkedList;

public class Number4 {

	public static void main(String[] args) {
		
		LinkedList<String> e = new LinkedList<String>(Arrays.asList("a","b","c","d","e"));

		e.addLast("f");
		System.out.println(e);
	}
}
