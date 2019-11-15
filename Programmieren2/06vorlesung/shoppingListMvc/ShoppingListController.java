package shoppingListMvc;

import java.util.Scanner;

public class ShoppingListController {

	private ShoppingListView view;
	private ShoppingListModel model;
	private Scanner scanner;

	public ShoppingListController() {
		//TODO OPTIONAL: Lies das Model in eine Datei, um beim auf die alten Daten zuzugreifen
		//TODO initialisere model, sonst NullPointerExeption
		//TODO initialisere view, sonst NullPointerExeption
		//TODO initialisere scanner, sonst NullPointerExeption
	}
	
	public void programLoop() {
	
		//TODO 1) solange der Benutzer nicht das Programm beenden will

		view.showOptions();
		//TODO 2) lies die Benutzereingabe ein, schreibe dir hierf�r ggfs eine Methode
		
		//TODO 3) wenn user option "programm schlie�en" gew�hlt hat
		//TODO 4) �nder die boolean Variable der while-Schleife zum Beenden des Programms
		//TODO 5) schlie�e den scanner
		//TODO OPTIONAL: Schreib das Model in eine Datei, um beim n�chsten Start auf die alten Daten zuzugreifen
		view.showCloseMessage();
		
		//TODO 6) wenn user option "neuen Artikel hinzuf�gen" gew�hlt hat
		view.showNewArticleMessage();
		//TODO 7) lies den Artikelnamen und den Kaufzyklus ein, schreibe dir hierf�r ggfs eine Methode
		//an dieser Stelle k�nnte euch die Klasse Pair helfen, damit eine Methode zwei Werte zur�ckgeben kann (ein Datenpaar / z.B. Name-Zyklus)
		model.setNewItem("eingegebener Artikel", 1);

		//TODO 8) wenn user option "alle Artikel des aktuellen Tages" gew�hlt hat
		view.showDailyArticleList(model.getItemOfCurrentDay());

		//TODO 9) wenn user option "n�chsten Tag" gew�hlt hat
		model.setDay(model.getDay() + 1);
		
	}
	
	
	
}
