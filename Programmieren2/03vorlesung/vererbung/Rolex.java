package vererbung;

/**
 * Infos zu abstrakten Klassen
 * <br><br>
 * Einer Klasse k�nnen wir mithilfe des Schl�sselwort extends sagen, 
 * dass sie von einer anderen Klasse erben soll.
 * Wenn wir schreiben "public class Rolex extends Clock", 
 * dann bedeutet das, dass die Klasse Rolex von der Klasse Clock erbt.
 * <br>
 * Die Klasse Rolex erbt in diesem Fall von der abstrakten Klasse Clock und 
 * muss daher die Methode tic() �berschreiben.
 * Diese Methode kann mit einem Rolex-spezifischen Verhalten gef�llt werden.
 * 
 * 
 * @author Stephi
 * @version 1.0
 */
public class Rolex extends Clock{

	public Rolex(String time) {
		//mit super() wird der Konstruktor von Clock aufgerufen. 
		super();
		
		//mit super.setTime() wird in der Elternklasse/Superklasse Clock 
		//die Methode setTime aufgerufen
		super.setTime(time);
	}
	
	@Override
	public void tic() {
		System.out.println("Die Rolex tickt: " + super.getTime());
		
	}

}
