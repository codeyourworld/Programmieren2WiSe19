package aufgabe3.a3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Base64;

public class EncodeDecode {
	
	public static void main(String[] args) {

		String test = "hallo";
		String fileName = "encoded.data";
		writeEncoded(test, fileName);
		System.out.println(readDecoded(fileName));
		
	}

	private static void writeEncoded(String test, String fileName) {
		byte [] bytes = Base64.getEncoder().encode(test.getBytes());

		System.out.println("encoded bytes: " + new String(bytes));
		
		try(BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fileName))) {
			
			bos.write(bytes);
			bos.flush();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private static String readDecoded(String fileName) {

		String text = "";
		
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File(fileName)))) {
			byte[] decodedBytes = Base64.getDecoder().decode(bis.readAllBytes());
			text = new String(decodedBytes);
			System.out.println("decoded bytes: " + text);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return text;
	}
}
