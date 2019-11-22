package aufgabe2.a3;

import java.util.ArrayList;
import java.util.Collections;

public class ContactMain {

	public static void main(String[] args) {
		ArrayList<Contact> contacts = new ArrayList<>();
		contacts.add(new Contact("0178263276333", "Katha"));
		contacts.add(new Contact("0176923479983", "Karsten"));
		contacts.add(new Contact("0175182947192", "Alex"));
		contacts.add(new Contact("0169327392478", "Sinom"));
		contacts.add(new Contact("0155928347238", "Sonja"));
		contacts.add(new Contact("0151283712192", "Nils"));
		contacts.add(new Contact("0160274923743", "Dennis"));
		
		Collections.sort(contacts);

		for (Contact contact : contacts) {
			System.out.println(contact);
		}
	}
}
