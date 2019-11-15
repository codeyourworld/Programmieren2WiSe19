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
		//TODO 2) lies die Benutzereingabe ein, schreibe dir hierfür ggfs eine Methode
		
		//TODO 3) wenn user option "programm schließen" gewählt hat
		//TODO 4) änder die boolean Variable der while-Schleife zum Beenden des Programms
		//TODO 5) schließe den scanner
		//TODO OPTIONAL: Schreib das Model in eine Datei, um beim nächsten Start auf die alten Daten zuzugreifen
		view.showCloseMessage();
		
		//TODO 6) wenn user option "neuen Artikel hinzufügen" gewählt hat
		view.showNewArticleMessage();
		//TODO 7) lies den Artikelnamen und den Kaufzyklus ein, schreibe dir hierfür ggfs eine Methode
		//an dieser Stelle könnte euch die Klasse Pair helfen, damit eine Methode zwei Werte zurückgeben kann (ein Datenpaar / z.B. Name-Zyklus)
		model.setNewItem("eingegebener Artikel", 1);

		//TODO 8) wenn user option "alle Artikel des aktuellen Tages" gewählt hat
		view.showDailyArticleList(model.getItemOfCurrentDay());

		//TODO 9) wenn user option "nächsten Tag" gewählt hat
		model.setDay(model.getDay() + 1);
		
	}
	
	
	
}
