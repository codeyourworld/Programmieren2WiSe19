package aufgabe5.shoppingList;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class ShoppinglistModel implements Serializable{
	
	//TODO initialisiere die shoppingMap
	//Name des Artikels und den kaufzyklus
	private HashMap<String, Integer> shoppingMap = new HashMap<>();;
	
	//aktuelle Tag
	private int day = 1;
	
	/**
	 * Returns a list of items which a user should buy that day
	 * @return list of items
	 */
	public ArrayList<String> getItemOfCurrentDay() {
		ArrayList<String> list = new ArrayList<>();
		for(String entry : shoppingMap.keySet()) {

			if(day % shoppingMap.get(entry) == 0) {
				list.add(entry);
			}
		}

		return list;
	}
	
	/**
	 * Add the item to the shopping list. 
	 * 
	 * @param item to buy
	 * @param repeat: every x day an item should be bought
	 */
	public void setNewItem(String item, int repeat) throws ItemExistsException {
		//TODO Falls so ein Item schon vorhanden ist, was soll dann passieren? 
		//Exception oder wird der Eintrag überschrieben?
		if(shoppingMap.containsKey(item)) {
			throw new ItemExistsException("The item " + item + " already exists");
		}
		shoppingMap.put(item, repeat);
		
	}
	
	/**
	 * 
	 * @param day : current day
	 */
	public void setDay(int day) {
		this.day = day;
	}
	
	/**
	 * 
	 * @return current day
	 */
	public int getDay() {
		return day;
	}
	
	/**
	 * Detele the item from list
	 * @param item
	 */
	public void deleteItem(String item) {
		//TODO ---------- optional -------------
		//TODO Falls so ein Item nicht vorhanden ist, was soll dann passieren? 
		
	}

	/**
	 * Repeat means in this case how often a item should be bought. This method changes the repetition cycle. 
	 * @param item
	 * @param repeat : every x day an item should be bought
	 */
	public void changeItem(String item, int repeat) {
		//TODO ---------- optional -------------
		//TODO Falls so ein Item nicht vorhanden ist, was soll dann passieren? 
		
	}
	
}
