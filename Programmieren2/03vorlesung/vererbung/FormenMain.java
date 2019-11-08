package vererbung;

public class FormenMain {

	public static void main(String[] args) {
		
		GeometrischeForm [] formen = new GeometrischeForm[3];
		formen[0] = new Kreis(1.5);
		formen[1] = new Rechteck(2.0, 2.0);
		formen[2] = new Kreis(1.0);
		
		
		
		for (GeometrischeForm geometrischeForm : formen) {
			if(geometrischeForm instanceof Kreis) {
				System.out.print("Der Umfang des Kreises ist: ");
			} else if(geometrischeForm instanceof Rechteck) {
				System.out.print("Der Umfang des Rechtecks ist: ");
			}
			System.out.println(geometrischeForm.umfang());
		}
		
	}
	
}
