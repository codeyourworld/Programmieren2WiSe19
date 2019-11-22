package aufgabe3.a1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class SaveUserInput {

	private Scanner scanner = new Scanner(System.in);

	/**
	 * Asks the user to enter a text and returns that text.
	 * 
	 * @return text
	 */
	public String getUserInput() {
		String text = "";
		System.out.println("Bitte gib einen Text ein:");
		text = scanner.nextLine();
		return text;
	}

	/**
	 * Writes a text to a file 
	 * @param fileName of the file
	 * @param text to write
	 */
	public void writeText(String fileName, String text) {
		try (FileWriter fw = new FileWriter(fileName, false); BufferedWriter writer = new BufferedWriter(fw)) {

			writer.write(text);
			writer.newLine();
			writer.flush();

		} catch (Exception e) {
			System.err.println("Der Text " + text + " konnte nicht in die Datei " + fileName + " geschrieben werden");
		}
	}

	/**
	 * Checks if the user wants to read from file or if the user wants to write to file.
	 * @return true if user wants to read, false if the user wants to write
	 */
	public boolean isReadOption() {
		boolean retValue = false;
		boolean correctInput = false;
		while(!correctInput) {
			System.out.println("Möchtest du aus der Datei lesen(r) oder schreiben(w)?");
			String answer = scanner.nextLine();
			switch (answer) {
			case "r":
				correctInput = true;
				retValue = true;
				break;
			case "w":
				correctInput = true;
				retValue = false;
				break;

			default:
				correctInput = false;
				System.out.println("Die Eingabe war nicht korrekt. Bitte gib nur r oder w ein.");
			}
		}
		return retValue;
		
	}

	/**
	 * Closes everything
	 */
	public void close() {
		scanner.close();

	}

	/**
	 * Returns the text from the file
	 * @param fileName of the file
	 * @return text
	 */
	public String readText(String fileName) {

		String text = "";
		try(FileReader fr = new FileReader(new File(fileName));
			BufferedReader reader = new BufferedReader(fr)) {

			String temp = reader.readLine();
			while(temp != null) {
				text += temp;
				temp = reader.readLine();
			}

		} catch (Exception e) {
			System.err.println("Es gab einen Fehler beim Lesen aus der Datei " + fileName);
		}
		return text;
	}
}
