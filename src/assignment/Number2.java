package assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class Number2 {

	public static void main(String[] args) {
		
		ArrayList<String> e = new ArrayList<String>(Arrays.asList("a","b","c","d","e"));
//		ArrayList<String> e1 = new ArrayList<String>();
		Object e1 = new ArrayList<String>();
		
		
//		e1 = (ArrayList<String>) e.clone();
//		System.out.println(e1);
// 		commented way works but you get warning as well
		e1 = e.clone();
		System.out.println(e1);
	}
}
