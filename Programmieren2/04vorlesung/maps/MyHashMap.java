package maps;

import java.util.HashMap;
import java.util.Set;

public class MyHashMap {

	public static void main(String[] args) {
		
		HashMap<String, Integer> books = new HashMap<>();
		
		books.put("1-312-123-12", 2);
		books.put("7-232-123-11", 43);
		
		books.put("7-232-123-11", books.get("7-232-123-11") - 1);
		
		Set<String> keys = books.keySet();
		for(String key : keys) {
			System.out.println("Die ISBN ist " + key + " und es sind " + books.get(key) + " Bücher vorhanden.");
		}
		
		
	}
	
}
