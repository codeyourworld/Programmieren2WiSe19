package interfaces;

public class BuyableStuff {

	public static void main(String[] args) {
		IBuyable[] buyable = new IBuyable[2];
		
		buyable[0] = new Flower(1.99);
		buyable[1] = new Game(9.99);
		
		for (IBuyable iBuyable : buyable) {
			System.out.println(iBuyable.price());
		}
		
		
		
	}
}
