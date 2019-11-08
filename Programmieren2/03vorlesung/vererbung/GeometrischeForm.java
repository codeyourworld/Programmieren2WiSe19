package vererbung;

/**
 * Die abstrakte Klasse GeometrischeForm ist die Superklasse für geometische Formen und 
 * deklariert die abstrakte Methode umfang().
 * 
 * Somit kann für jede geometische Form diese Berechnung aufgerufen werden.
 * 
 * @author Stephi
 * @version 1.0
 *
 */
public abstract class GeometrischeForm {
	
	/**
	 * Default constructor
	 */
	public GeometrischeForm() {
	}

	/**
	 * Berechnet den Umfang der geometrischen Form.
	 * @return Umfang
	 */
	public abstract double umfang();
	
}
