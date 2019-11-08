package datenstrukturen;

/**
 * Ein Score stellt ein Spielergebnis eines Spielers mit dem Namen und der erreichten Punktezahl dar.
 * 
 * @author Stephi
 * @version 1.0
 */
public class Score implements Comparable<Score>{

	private String name;
	private int points;

	
	public Score(String name, int points) {
		super();
		this.name = name;
		this.points = points;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return "Score [name=" + name + ", points=" + points + "]";
	}

	@Override
	public int compareTo(Score o) {
		int temp = 0;

		if(points == o.points) {
			temp = name.compareTo(o.name);
		} 
		else {
			temp = points < o.points? 1 : -1;
		}

		//ausdruck ? true : false
		return temp;
	}

	

}
