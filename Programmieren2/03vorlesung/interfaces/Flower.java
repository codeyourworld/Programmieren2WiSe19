package interfaces;

/**
 * Info zu Interfaces
 * <br><br>
 * Siehe Klasse Game
 * @author Stephi
 * @see Game
 *
 */
public class Flower implements IBuyable {

	private double price;
	
	public Flower(double price) {
		this.price = price;
	}
	
	@Override
	public double price() {
		return price;
	}

}
