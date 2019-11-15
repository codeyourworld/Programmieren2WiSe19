package shoppingListMvc;

import java.util.ArrayList;

public class ShoppingListView {

	/**
	 * Shows all options a user can choose. Options are:<br>
	 * a) Close program
	 * b) Add a new item to the shopping list
	 * c) Show shopping list of current day
	 * d) Set next day
	 * 
	 * Optionally you can offer the options to delete an item and to change an item.
	 */
	public void showOptions() {
		
	}
	
	/**
	 * Demands the user to enter a new item name and a repeat value
	 */
	public void showNewArticleMessage() { //showArticleCommand
		
	}
	
	/**
	 * Shows the shopping list of the current day
	 * @param arrayList to print
	 */
	public void showDailyArticleList(ArrayList<String> arrayList) {
		
	}
	
	/**
	 * Prints a goodbye message while closing the program
	 */
	public void showCloseMessage() {
		
	}
	
	/**
	 * Shows that the last user input was wrong
	 */
	public void showWrongInputMessage() {
		//TODO optionally this method could have a String parameter with an error message
	}
	
	/**
	 * Demands the user to enter an item to delete
	 */
	public void showDeleteMessage() {
		//TODO ---------- optional -------------
		
	}
	
	/**
	 * Demands the user to enter an item to change
	 */
	public void showChangeMessage() {
		//TODO ---------- optional -------------

	}
}
