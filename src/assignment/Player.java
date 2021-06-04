package assignment;

public class Player implements Comparable<Player> {

	int ranking;
	String name;
	int age;
	
	public Player(int ranking, String name, int age) {
		this.ranking = ranking;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Player o) {
		
		if(ranking > o.ranking) 
			return 1;
		else if (ranking < o.ranking)
			return -1;
			else  
			return 0;
	}



}
