package aufgabe3.a2;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ScoreWriter {

	
	/**
	 * Writes all scores data from ArrayList to file
	 * @param scores list of scores which should be write
	 * @param fileName name of file
	 */
	public void writeScores(ArrayList<Score> scores, String fileName) {
		
		try(PrintWriter writer = new PrintWriter(fileName)) {
			for(Score score : scores) {
				writer.println(score.toString());
				writer.flush();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	/**
	 * Reads all entries from file
	 * @param fileName name of file
	 * @return content of the file as a string
	 */
	public String readScores(String fileName) {
		
		String text = "";
		try(Scanner scanner = new Scanner(new File(fileName))){
			while(scanner.hasNextLine()) {
				text += scanner.nextLine() + "\n";
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return text;
	}
	
}
