package assignment;

import java.util.Arrays;
import java.util.ArrayList;

public class Number6 {

	public static void main(String[] args) {
		
		ArrayList<String> e1 = new ArrayList<String>(Arrays.asList("a","b","c","d","e"));
		ArrayList<String> e2 = new ArrayList<String>(Arrays.asList("f","g","h","i","j"));
		
		System.out.println(e1);
		e1.addAll(e2);
		System.out.println(e1);
	}
}
