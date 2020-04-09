package datenstrukturen;

import java.util.ArrayList;
import java.util.Collections;

public class Highscore {
	
	public static void main(String[] args) {
		
		/*
		 * Dies ist nur ein Test :) 
		 */
		ArrayList<Score> highscore = new ArrayList<>();
		highscore.add(new Score("Dennis", 10));
		highscore.add(new Score("Anna", 12));
		highscore.add(new Score("Anton", 12));
	
		//um Collections verwenden zu können, müssen die Elemente einer 
		//Datenstruktur das Interface Comparable implementieren
		//Collections bietet Methoden wie sort, shuffle, min, max an...
		Collections.sort(highscore);
		
		for (Score score : highscore) {
			System.out.println(score);
		}
		
//		for (int i = 0; i < highscore.size(); i++) {
//			System.out.println(highscore.get(i).toString());
//		}
		
		
		
		
		
	}

}
