package fileIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteMain {
	
	public static void main(String[] args) {
		File file = new File("file.txt");
		
		writeChars(file);
		
		writeBytes(file);
	}

	private static void writeBytes(File file) {
		try(FileOutputStream fos = new FileOutputStream(file, true)) {
			fos.write(98);
			fos.flush();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

	private static void writeChars(File file) {
		try (FileWriter writer = new FileWriter(file, true);
			 PrintWriter printWriter = new PrintWriter(writer)){
			
			printWriter.println("Hallo Welt!");
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
