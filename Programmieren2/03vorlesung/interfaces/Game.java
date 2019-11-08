package interfaces;

/**
 * Info zu Interfaces
 * <br><br>
 * Wenn man ein Interface implementieren m�chte, benutzt man das Schl�sselwort implements.
 * Eine Klasse kann beliebig viele Interfaces implementieren. Diese k�nnte so aussehen: 
 * implements IBuyable, Comparable<Game>
 * Alle deklarierten Methoden des Interfaces m�ssen �berschrieben werden.
 * 
 * 
 * @author Stephi
 *
 */
public class Game implements IBuyable {

	private double price;
	
	public Game(double price) {
		this.price = price;
	}
	
	
	@Override
	public double price() {
		return price;
	}

}
