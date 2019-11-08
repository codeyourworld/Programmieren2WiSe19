package aufgabe1;

import java.util.Scanner;

public class TextOperations {


	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		exercise1(input);
		exercise2(input);
		exercise3(input);
		exercise4(input);
		exercise5();
		exercise6();
		exercise7(input);
		exercise8();
		
		input.close();

	}

	private static void exercise1(Scanner input) {
		
//		Aufgabe 1)
//		Fragt den Benutzer nach 2 Zahlen zwischen -999 und 999. Diese Zahlen sollen miteinander multipliziert werden. 
//		Dabei sollen alle Zahlen unter einander stehen, egal ob 0 oder -999 eingegeben wurde. 
//		Mit String.format() k�nnt ihr Strings nach euren Bed�rfnissen ausgeben. Man kann z.B. angeben wie viele 
//		Stellen f�r eine Zahl reserviert wird. Wenn ihr 2 Stellen f�r eine ganze Zahl reservieren wollt, 
//		k�nnt ihr das schreiben: String.format(�%2d�, zahl);

		
		System.out.println("\n\nAufgabe 1\n");
		
		
		System.out.println("Bitte gib eine Zahl zwischen -999 und 999 ein:");
		int num1 = input.nextInt();

		System.out.println("Bitte gib eine weitere Zahl zwischen -999 und 999 ein:");
		int num2 = input.nextInt();

		System.out.println(String.format("%4d * %4d = %7d", num1, num2, (num2 * num2)));

	}

	private static void exercise2(Scanner input) {
		
//		Aufgabe 2)
//		Berechnet den Mittelwert von den 4 Zahlen, die der Benutzer eingibt. Der Mittelwert wird berechnet, 
//		in dem alle Zahlen addiert werden und dann durch die Anzahl der Zahlen dividiert wird. Also
//		3 + 4 + 17 + 20 = 44 und 44 / 4 = 11.
//		Damit ist 11 der Mittelwert. Gibt den Mittelwert mit maximal 2 Nachkommastellen an. 
//		Auch hier ist String.format() euer Freund.
		
		
		final int MEAN_NUMBER = 4;
		double erg = 0.0;

		System.out.println("\n\nAufgabe 2\n");
		for (int i = 0; i < MEAN_NUMBER; i++) {
			System.out.println("Bitte gib eine Zahl ein:");
			erg += input.nextInt();
		}

		erg /= MEAN_NUMBER;
		System.out.println(String.format("Der Mittelwert ist %.2f", erg));

	}

	private static void exercise3(Scanner input) {

//		Aufgabe 3)
//		Stellt euch vor ihr wollt in einer Mail nach einem Wort suchen. Erstellt eine String Variable, 
//		in der ein langer Text steht. Nun wollt ihr wissen, ob ein bestimmtes Wort im Text auftaucht. 
//		Das pr�ft ihr mit der Methode contains(String wort), contains() ist eine Instanz/Objektmethode 
//		von String und gibt true oder false zur�ck.
		
		
		String text = "Stellt euch vor ihr wollt in einer Mail nach einem Wort suchen. Erstellt eine String Variable, "
				+ "in der ein langer Text steht. Nun wollt ihr wissen, ob ein bestimmtes Wort im Text auftaucht. Das "
				+ "pr�ft ihr mit der Methode contains(String wort), contains() ist eine Instanz/Objektmethode von "
				+ "String und gibt true oder false zur�ck.";

		System.out.println("\n\nAufgabe 3\n");
		System.out.println("Bitte gib ein Wort ein, nach dem gesucht werden soll:");
		String word = input.next();

		if (text.contains(word)) {
			System.out.println("Der folgende Text enth�lt das Wort: " + word + "\n\n" + text);
		} else {
			System.out.println("Der folgende Text enth�lt nicht das Wort: " + word + "\n\n" + text);

		}

	}

	private static void exercise4(Scanner input) {
		
//		Aufgabe 4)
//		Im n�chsten Szenario wollt ihr in einem Text ein Wort ersetzen, wenn es vorhanden ist. 
//		Dabei hilft euch die String Instanzmethode replaceAll(String find, String replace), 
//		replace gibt euch den bearbeiteten Text als R�ckgabewert zur�ck.
//		Spielt mit den replace-Methoden ein bisschen rum. Wo liegen die Unterschiede?
		
		
		String text = "Im n�chsten Szenario wollt ihr in einem Text ein Wort ersetzen, wenn es vorhanden ist. "
				+ "Dabei hilft euch die String Instanzmethode replaceAll(String find, String replace), "
				+ "replace gibt euch den bearbeiteten Text als R�ckgabewert zur�ck.\r\n"
				+ "Spielt mit den replace-Methoden ein bisschen rum. Wo liegen die Unterschiede?";

		
		System.out.println("\n\nAufgabe 4\n");

		
		System.out.println("Bitte gib ein Wort ein, das ersetzt werden soll:");
		String find = input.next();

		System.out.println("Bitte gib ein Wort ein, das eingef�gt werden soll:");
		String replace = input.next();

		System.out.println("Mit replaceFirst:\n" + text.replaceFirst(find, replace));
		System.out.println("Mit replaceAll:\n" + text.replaceAll(find, replace));
	}

	private static void exercise5() {
//		Aufgabe 5)
//		Ihr wollt ein Chatfenster programmieren und alle Kontakte dem Namen nach unter einander
//		auflisten. Daf�r m�sst ihr die Namen miteinander vergleichen. Mit der String-Methode
//		compareToIgnoreCase(String name) k�nnt ihr pr�fen, welcher Name alphabetisch sortiert als erstes
//		kommt. name1.compareToIgnoreCase(name2) liefert euch
//		� eine Zahl kleiner 0 zur�ck, wenn name1 vor name2 kommt
//		� 0 zur�ck, wenn name1 gleich name2 ist
//		� eine Zahl gr��er 0, wenn name2 vor name1 kommt.
//		Vergleicht 3 Namen und gebt die in der richtigen Reihenfolge aus.

		
		String [] names = {"Augustus", "Anton", "Anna"};

		System.out.println("\n\nAufgabe 5\n");

		compareFirstName(names[0], names[1], names[2]);
		compareFirstName(names[1], names[0], names[2]);
		compareFirstName(names[2], names[1], names[0]);
		
		
		
	}
	
	private static void compareFirstName(String name1, String name2, String name3) {
		if(name1.compareToIgnoreCase(name2) <= 0 && name1.compareToIgnoreCase(name3) <= 0) {
			System.out.println(name1);
			if(name2.compareToIgnoreCase(name3) < 0) {
				System.out.println(name2);
				System.out.println(name3);
			}
			else {
				System.out.println(name3);
				System.out.println(name2);
			}
		}
	}

	
	private static void exercise6() {
//		Aufgabe 6)
//		In den Logdaten steht als 4. Zeichen immer ein �t� oder �f�. Dabei steht �t� f�r der User hat das Level
//		erfolgreich absolviert oder �f� nicht geschafft.
//		Pr�ft mit der String Instanzmethode charAt(int index), ob an der 4. Stelle �t� oder �f� steht und gebt
//		entsprechend das Ergebnis aus. charAt() gibt das Zeichen an der Stelle index zur�ck.

		
		String logData1 = "L2 f time 0.15";
		final int INDEX_LVL_SUCC = 3; 
		
		System.out.println("\n\nAufgabe 6\n");

		
		if(logData1.charAt(INDEX_LVL_SUCC) == 't') {
			System.out.println(logData1 + ": Der Spieler hat das Level absolviert");
		} else {
			System.out.println(logData1 + ": Der Spieler hat das Level nicht absolviert");

		}

		
	}
	
	

	private static void exercise7(Scanner input) {
//		Aufgabe 7)
//		F�r ein Online-Game sollen sich alle Benutzer anmelden. Dabei soll kein Benutzername doppelt
//		vorkommen. Testet mit der String Instanzmethode equals(String name), ob der Name schon
//		vergeben ist. Es gibt schon zwei Benutzernamen, fordert den Benutzer auf solange einen
//		Benutzernamen einzugeben, bis der eingegebene Name noch nicht vergeben ist.
		
		String[] names = { "Timo", "Mara" };
		boolean userNameAvailable = false;
		String name = "";

		System.out.println("\n\nAufgabe 7\n");

		
		while (!userNameAvailable) {

			userNameAvailable = true;
			System.out.println("Bitte gib einen Usernamen ein:");
			name = input.next();

			for (int i = 0; i < names.length; i++) {
				if (names[i].equals(name)) {
					userNameAvailable = false;
					System.out.println("Sorry, es gibt den Namen " + name + " schon. ");
				}

			}
		}

		System.out.println("Herzlichen Gl�ckwunsch " + name + "! Dein Name ist verf�gbar.");
	}

	
	private static void exercise8() {
//			Aufgabe 8)
//			Ihr wollt RGB-Werte aus einer Datei auslesen, die Werte sind in der Datei wie folgt abgelegt:
//			255#211#89
//			0#0#0
//			Das # fungiert als Trenner zwischen den Werten, mit der String Instanzmethode split(String trenner)
//			wird in diesem Fall der String in 3 Teile aufgeteilt und als String Array mit 3 Elementen zur�ck
//			gegeben.
//			Gebt die RGB-Werte aus dem zur�ckgegebenen Array aus.
		
		String rgb = "234#234#21";
		String[] rgbArray = rgb.split("#");
		
		
		System.out.println("\n\nAufgabe 8\n");

		
		System.out.print("Die RGB-Werte sind: ");
		for (int i = 0; i < rgbArray.length; i++) {
			System.out.print(rgbArray[i] + " ");
		}
		
		
	}

}
