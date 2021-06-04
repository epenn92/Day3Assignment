package assignment;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Number5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("type a character");
		String str = input.next();
//		char c = str.charAt(0);
		LinkedList<String> e = new LinkedList<String>(Arrays.asList("a","b","c","d","e"));
		if(e.contains(str)) 
			System.out.println("That character is in String");
		else 
			System.out.println("That character is not in String");
		
		input.close();
	}
}
