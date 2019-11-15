package shoppingListMvc;

import java.util.ArrayList;
import java.util.HashMap;

public class ShoppingListModel {
	
	//TODO initialisiere die shoppingMap
	//Name des Artikels und den kaufzyklus
	private HashMap<String, Integer> shoppingMap;
	
	//aktuelle Tag
	private int day;
	
	/**
	 * Returns a list of items which a user should buy that day
	 * @return list of items
	 */
	public ArrayList<String> getItemOfCurrentDay() {
		
		return null;
	}
	
	/**
	 * Add the item to the shopping list. 
	 * 
	 * @param item to buy
	 * @param repeat: every x day an item should be bought
	 */
	public void setNewItem(String item, int repeat) {
		//TODO Falls so ein Item schon vorhanden ist, was soll dann passieren? 
		//Exception oder wird der Eintrag überschrieben?
		
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
