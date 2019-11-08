package KlassenKrashKurs;

public class Main {
	
	public static void main(String[]args) {
		
		Mensch hans = new Mensch("Hans",42);
		hans.setBeine(3);
		
		System.out.println("Hans Nasenlänge = "+hans.getNasenlange()+"\nHans Name = "+hans.getName() );
		
		System.out.println("Hans hat soviele Beine: "+hans.getBeine());
		
	}
	
}
