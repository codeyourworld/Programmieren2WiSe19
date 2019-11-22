package aufgabe2.a1;

import java.util.ArrayList;
import java.util.Collections;

public class ScoreMain {

	public static void main(String[] args) {
		ArrayList<Score> scores = new ArrayList<>();
		scores.add(new Score(15, "Mira"));
		scores.add(new Score(4, "Hugo"));
		scores.add(new Score(54, "Astrid"));
		scores.add(new Score(23, "Micha"));
		scores.add(new Score(67, "Moritz"));
		scores.add(new Score(23, "Anna"));
		
		//sortiert die Liste
		Collections.sort(scores);


		for(Score score : scores) {
			System.out.println(score);
		}
		
		
	}
	
}
