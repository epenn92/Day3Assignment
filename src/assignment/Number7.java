package assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Number7 {

	public static void main(String[] args) {
		
		ArrayList<Player> e = new ArrayList<Player>();
		e.add(new Player(3,"Jim",10));
		e.add(new Player(2, "Kim", 25));
		e.add(new Player(1, "Sam", 18));
		
		Collections.sort(e);
		for(Player e1 : e) {
		System.out.println(e1.ranking + " " + e1.name + " " + e1.age);
		}
	}
}
