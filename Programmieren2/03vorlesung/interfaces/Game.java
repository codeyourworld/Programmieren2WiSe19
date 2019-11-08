package interfaces;

/**
 * Info zu Interfaces
 * <br><br>
 * Wenn man ein Interface implementieren möchte, benutzt man das Schlüsselwort implements.
 * Eine Klasse kann beliebig viele Interfaces implementieren. Diese könnte so aussehen: 
 * implements IBuyable, Comparable<Game>
 * Alle deklarierten Methoden des Interfaces müssen überschrieben werden.
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
