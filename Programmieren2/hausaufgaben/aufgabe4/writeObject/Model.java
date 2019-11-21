package aufgabe4.writeObject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class Model implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HashMap<String, Integer> shoppingMap = new HashMap<>();
	private int currentDay = 1;

	public void initList() {
		shoppingMap.put("Brot", 1);
		shoppingMap.put("Obst", 1);
		shoppingMap.put("Kaffee", 7);
		shoppingMap.put("Mate", 1);
		shoppingMap.put("Kekse", 2);
	}
	
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
