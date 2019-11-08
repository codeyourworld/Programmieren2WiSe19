package sets;

import java.util.HashSet;
import java.util.Iterator;

import vererbung.Kreis;

public class MySet {

	public static void main(String[] args) {
		Kreis kreis = new Kreis(3.0);
		Kreis kreis2 = new Kreis(3.0);
		String b = "Hello";
		String a = "Hello";
		//b = a;
		
		//equals = Inhalt
		//== 
		
		if(kreis == kreis2) {
			System.out.println("a == b");
		} else {
			System.out.println("a != b");
		}
		
		if(kreis.equals(kreis2)) {
			System.out.println("a hat den gleichen Inhalt wie b");
		} else {
			System.out.println("a und b sind verschieden");
		}
		
		
		HashSet<Integer> set = new HashSet<>();
		
		set.add(3);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(1);
		
		for(Integer i : set) {
			System.out.println(i);
		}
		
		for (Iterator<Integer> iterator = set.iterator(); iterator.hasNext();) {
			int integer = (Integer) iterator.next();
			System.out.println(integer);			
		}

		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	
}
