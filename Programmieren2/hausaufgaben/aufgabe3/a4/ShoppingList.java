package aufgabe3.a4;

import java.util.ArrayList;
import java.util.HashMap;

public class ShoppingList {

	private HashMap<String, Integer> shoppingMap = new HashMap<>();
	private int currentDay = 1;

	public ArrayList<String> getListForDay() {
		
		ArrayList<String> list = new ArrayList<>();
		for(String entry : shoppingMap.keySet()) {

			if(currentDay % shoppingMap.get(entry) == 0) {
				list.add(entry);
			}
		}

		return list;
	}
	
	public void nextDay() {
		currentDay++;
	}
	
	public void addElement(String entry, int repetition) {
		shoppingMap.put(entry, repetition);
	}
	

}
