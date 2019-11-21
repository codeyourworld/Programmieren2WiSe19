package shoppingList;

import java.util.ArrayList;
import java.util.Iterator;

public class ShoppinglistView {

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
		System.out.println("Was möchtest du machen:\n" + 
				"a) Programm beenden\n" + 
				"b) Einen neuen Artikel hinzufügen\n" + 
				"c) die aktuelle Einkfausliste anzeigen\n" + 
				"d) einen anderen Tag setzen\n");
	}
	
	/**
	 * Demands the user to enter a new item name and a repeat value
	 */
	public void showNewArticleMessage() { //showArticleCommand
		System.out.println("Bitte gib ein Artikel ein:");
	}

	/**
	 * Demands the user to enter a new item name and a repeat value
	 */
	public void showNewArticleRepeatMessage() { //showArticleCommand
		System.out.println("Wie oft möchtest du diesen Artikel einkfauen:");
	}

	/**
	 * Shows the shopping list of the current day
	 * @param arrayList to print
	 */
	public void showDailyArticleList(ArrayList<String> arrayList, int day) {
		System.out.println("Einkfaufsliste - Tag " + day + ":\n");
		System.out.println("------------------------");
		for (String string : arrayList) {
			System.out.println(string);
		}
		System.out.println("------------------------");
	}
	
	/**
	 * Prints a goodbye message while closing the program
	 */
	public void showCloseMessage() {
		System.out.println("Programm beendet");
	}
	
	/**
	 * Shows that the last user input was wrong
	 */
	public void showWrongInputMessage(String errorMessage) {
		//TODO optionally this method could have a String parameter with an error message
		System.err.println(errorMessage + "\n");
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
