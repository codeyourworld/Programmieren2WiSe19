package shoppingList;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ShoppinglistController {

	private ShoppinglistView view;
	private ShoppinglistModel model;
	private Scanner scanner;
	private static final String filename = "ShoppingList.bin";
	private boolean isRunning = true;

	
	public ShoppinglistController() {
		// TODO OPTIONAL: Lies das Model in eine Datei, um beim auf die alten Daten
		// zuzugreifen
		// TODO initialisere model, sonst NullPointerExeption
		try (FileInputStream fis = new FileInputStream(new File(filename));
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			Object object = ois.readObject();
			if (object instanceof ShoppinglistModel) {
				model = (ShoppinglistModel) object;
			}
		} catch (Exception e) {
		}
		if (model == null) {
			model = new ShoppinglistModel();
		}

		// TODO initialisere view, sonst NullPointerExeption
		view = new ShoppinglistView();

		// TODO initialisere scanner, sonst NullPointerExeption
		scanner = new Scanner(System.in);
	}

	
	
	public void programLoop() {

		// TODO 1) solange der Benutzer nicht das Programm beenden will
		while (isRunning) {

			view.showOptions();

			// TODO 2) lies die Benutzereingabe ein, schreibe dir hierfür ggfs eine Methode
			String option = scanner.nextLine();

			switch (option) {

			// TODO 3) wenn user option "programm schließen" gewählt hat
			case "a":
				stopAndClose();
				break;

			// TODO 6) wenn user option "neuen Artikel hinzufügen" gewählt hat
			case "b":
				addNewItem();
				break;
			
			// TODO 8) wenn user option "alle Artikel des aktuellen Tages" gewählt hat
			case "c":
				view.showDailyArticleList(model.getItemOfCurrentDay(), model.getDay());
				break;
				
			// TODO 9) wenn user option "nächsten Tag" gewählt hat
			case "d":
				model.setDay(model.getDay() + 1);
				break;


			default:
				view.showWrongInputMessage("Bitte geben Sie entweder a, b, c oder d ein.");
			}


		}

	}

	private void addNewItem() {
		view.showNewArticleMessage();

		// TODO 7) lies den Artikelnamen und den Kaufzyklus ein, schreibe dir hierfür
		// ggfs eine Methode
		// an dieser Stelle könnte euch die Klasse Pair helfen, damit eine Methode zwei
		// Werte zurückgeben kann (ein Datenpaar / z.B. Name-Zyklus)
		String item = scanner.nextLine();
		view.showNewArticleRepeatMessage();
		int repeat = scanner.nextInt();
		scanner.nextLine();
		try {
			model.setNewItem(item, repeat);
		} catch (ItemExistsException e) {
			view.showWrongInputMessage("This item already exists.");
		}
	}

	private void stopAndClose() {
		// TODO 4) änder die boolean Variable der while-Schleife zum Beenden des
		// Programms
		isRunning = false;

		// TODO 5) schließe den scanner
		scanner.close();

		// TODO OPTIONAL: Schreib das Model in eine Datei, um beim nächsten Start auf
		// die alten Daten zuzugreifen
		write();

		view.showCloseMessage();		
	}
	
	private void write() {
		try (FileOutputStream fos = new FileOutputStream(new File(filename));
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(model);
			oos.flush();
		} catch (Exception e) {
			view.showWrongInputMessage("Save data failed");
		}
	}

}
