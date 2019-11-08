package klassen;

public class MyCar {

	public static void main(String[] args) {
		Auto meinAuto = new Auto();
		System.out.println(meinAuto.getFarbe() + ", " + meinAuto.getModel());
		
		Auto meinBulli = new Auto("Gruen", "Bulli");
		System.out.println(meinBulli.getFarbe() + ", " + meinBulli.getModel());
	}
}
