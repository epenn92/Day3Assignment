package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Number8 {

	public static void main(String[] args) {
		
		ArrayList<Player> e = new ArrayList<Player>();
		e.add(new Player(3,"Jim",10));
		e.add(new Player(2, "Kim", 25));
		e.add(new Player(1, "Sam", 18));
		
		//compare by ranking
		Collections.sort(e, new RankingComparator());
		Iterator<Player> it = e.iterator();
		while(it.hasNext()) {
			Player p = (Player)it.next();
			System.out.println(p.ranking + " " + p.name + " " + p.age);
		}
		
//		for(Player e1 : e) {
//		System.out.println(e1.ranking + " " + e1.name + " " + e1.age);
//		
//		}
	}
}
