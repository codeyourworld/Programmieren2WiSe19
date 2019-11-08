package shoppinglist;

public class ShoppingList {

	//TODO ersetzt diese Arrays durch eine HashMap und ändert entsprechend die Ausgaben
	private String [] articles = {"Pizza", "Chips", "Cola", "Mate", "Kaffee"};
	private int [] repetition = {1, 7, 2, 3, 14};
	private int currentDay = 1;
	
	public String getListForDay() {
		String list = "Tag " + currentDay + "\n\nDie Einkaufsliste sieht so aus:\n\n";
		for (int i = 0; i < repetition.length; i++) {
			if(currentDay % repetition[i] == 0) {
				list += articles[i] + "\n";
			}
		}
		list += "------------------------\n\n";
		
		return list;
	}
	
	public void nextDay() {
		currentDay++;
	}
	
	
	public void printAMonth() {
		for(int i = 0; i < 31; i++) {
			System.out.println(getListForDay());
			nextDay();
		}
	}
	
	public static void main(String[] args) {
		ShoppingList shoppingList = new ShoppingList();
		shoppingList.printAMonth();
	}
}
