package assignment;

import java.util.Comparator;

public class RankingComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Player p1 = (Player)o1;
		Player p2 = (Player)o2;
		
		return p1.name.compareTo(p2.name);
	}

}
