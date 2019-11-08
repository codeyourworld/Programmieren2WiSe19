package vererbung;

/**
 * 
 * Präsentiert ein Kreis und stellt eine Methode zur Berechnung des Umfangs zur Verfügung.
 * 
 * @author Stephi
 * @version 1.0
 *
 */
public class Kreis extends GeometrischeForm {

	double radius;
	
	/**
	 * @param radius des Kreises
	 */
	public Kreis(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double umfang() {
		
		return 2*Math.PI*radius;
	}

}
