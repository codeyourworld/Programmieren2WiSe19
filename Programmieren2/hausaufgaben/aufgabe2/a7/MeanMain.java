package aufgabe2.a7;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class MeanMain {

	public static void main(String[] args) {
		
		LinkedList<Double> list = new LinkedList<>();
		Scanner scanner = new Scanner(System.in);
		String input = "";
		
		while(!input.equals("quit")) {
			System.out.println("Bitte gib einen neuen Wert oder quit zum Beenden ein:");
			input = scanner.nextLine();
			
			try {
				double value = Double.valueOf(input);
				list.addLast(value);
			} catch (NumberFormatException e) {
				System.err.println("Bitte gib Kommazahlen nach diesen Schema ein: 3.232");
			}			
		}
		
		Iterator<Double> it = list.iterator();
		double sum = 0.0;
		while(it.hasNext()) {
			sum += it.next();
		}
		
		sum /= list.size();
		
		System.out.println("Der Mittelwert ist " + sum);
		
		scanner.close();
		
	}
	
}
