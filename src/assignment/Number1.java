package assignment;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.ListIterator;

public class Number1 {

	public static void main(String[] args) {
		
		ArrayList<String> e = new ArrayList<String>(3);
		e.add("hi");
		e.add("how");
		e.add("are");
		
		System.out.println(e);
		Collections.swap(e, 0, 2);
		System.out.println(e);
//		String s1 = null;
//		String s2 = null;
//		String temp = null;
//		
//		ListIterator<String> it = e.listIterator();
//		for(int i = 0; i < e.size(); i++) {
//			if( i == 2 ) {
//				s1 = it.next();
//				s2 = it.previous();
//				temp = s1;
//				s1 = s2;
//				s2 = temp;
//				
//			}
//			s1 = it.next();
//			System.out.println(s1);
//		}
//			while(it.hasNext()) {
//				System.out.println(it.next());
//				s1 = it.next();
//			}
	}
}
