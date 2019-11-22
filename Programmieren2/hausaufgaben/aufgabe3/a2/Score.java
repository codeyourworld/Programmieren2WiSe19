package aufgabe3.a2;

public class Score implements Comparable<Score> {
	
	private int points;
	private String name;
	
	public Score(int points, String name) {
		super();
		this.points = points;
		this.name = name;
	}

	
	public int getPoints() {
		return points;
	}

	
	public String getName() {
		return name;
	}


	@Override
	public int compareTo(Score o) {
		if(points == o.points) {
			return name.compareTo(o.name);
		}
		return points > o.points ? -1 : 1;
	}

	@Override
	public String toString() {
		return String.format("%5d\t%s", points, name);
	}
}
