package aufgabe4.tictactoe;


/**
 * View zeigt alle notwendigen Aufgaben für das Spiel TicTacToe an.
 * 
 * @author Stephi
 * @version 1.0
 */
public class View {

	/**
	 * Zeichnet das 3x3 TicTacToe Spielfeld.
	 * @param ttt int Array mit 9 Elementen
	 */
	public void drawGameField(int [] ttt) {
		for(int i = 0; i < ttt.length; i++) {
			System.out.print(ttt[i] + " | ");
			if(i % 3 == 2) {
				System.out.println("\n---------------");
			}
		}
	}

	/**
	 * Gibt den Spieger aus.
	 * @param symbol Symbol von dem Spieler, der gewonnen hat
	 */
	public void showWinner(String symbol) {
		System.out.println(symbol + " hat gewonnen");
	}
	
	/**
	 * Zeigt das Spielende an, bei dem kein Spieler gewonnen hat.
	 */
	public void showGameEnd() {
		System.out.println("Das Spiel ist vorbei, aber es hat keiner gewonnen");
	}

	/**
	 * Fordert den Spieler auf eine Zahl zwischen 0 und 8 zu setzen.
	 * @param symbol Symbol von dem Spieler, der setzen soll.
	 */
	public void showOutput(String symbol) {
		System.out.println(symbol + " gib eine Zahl zwischen 0 und 8 ein:");

	}
	
}
