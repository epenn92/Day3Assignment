package assignment;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Number3 {

	public static void main(String[] args) {
		
		LinkedList<String> e = new LinkedList<String>(Arrays.asList("a","b","c","d","e"));
		Iterator<String> it = e.descendingIterator();
		System.out.println(e);
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
	
