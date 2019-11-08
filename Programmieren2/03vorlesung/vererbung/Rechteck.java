package vererbung;

/**
 * Präsentiert ein Rechteck und stellt eine Methode zur Berechnung des Umfangs zur Verfügung.
 * 
 * @author Stephi
 * @version 1.0
 */
public class Rechteck extends GeometrischeForm {

	private double seitenlaengeA;
	private double seitenlaengeB;

	/**
	 * 
	 * @param seitenlaengeA Seite des Rechtecks
	 * @param seitenlaengeB Seite des Rechtecks, die an der seitenlaengeA liegt
	 */
	public Rechteck(double seitenlaengeA, double seitenlaengeB) {
		this.seitenlaengeA = seitenlaengeA;
		this.seitenlaengeB = seitenlaengeB;
	}

	@Override
	public double umfang() {
		return 2*seitenlaengeA + 2*seitenlaengeB;
	}

	public double getSeitenlaengeA() {
		return seitenlaengeA;
	}

	public void setSeitenlaengeA(double seitenlaengeA) {
		this.seitenlaengeA = seitenlaengeA;
	}

	public double getSeitenlaengeB() {
		return seitenlaengeB;
	}

	public void setSeitenlaengeB(double seitenlaengeB) {
		this.seitenlaengeB = seitenlaengeB;
	}
	
		
}
