package tictactoe;

/**
 * Das Model mit den Spieledaten und der
 * 
 * @author Stephi
 *
 */
public class TicTacToe {

	/**
	 * Symbol für den Spieler, der O hat
	 */
	public static final int SYMBOL_O = 1;
	/**
	 * Symbol für den Spieler, der X hat
	 */
	public static final int SYMBOL_X = 2;
	/**
	 * Symbol, um anzuzeigen, dass noch nicht gesetzt ist
	 */
	public static final int SYMBOL_NOT_SET = 0;

	private int [] field = new int[9];


	/**
	 * Setzt das Symbol im 3x3 Feld, wobei nur SYMBOL_O und SYMBOL_X valide sind. Diese Symbole werden nur gesetzt, wenn an der Stelle noch kein Symbol gesetzt ist. Gültige Indices sind 0 bis 8.
	 * @param symbol Symbol, das gesetzt werden soll
	 * @param index Index, an dem das Symbol gesetzt werden soll
	 * @return true, wenn das Symbol gesetzt werden konnte, ansonsten false.
	 */
	public boolean setSymbol(int symbol, int index) {
		if(index < 0 || index >= field.length) {
			return false;
		}
		if((symbol == SYMBOL_O || symbol == SYMBOL_X) && field[index] == SYMBOL_NOT_SET) {
			field[index] = symbol;
			return true;
		}
		else {
			return false;
		}
		
		
	}


	/**
	 * Gibt true zurück, wenn an allen Indices im Feld SYMBOL_O oder SYMBOL_X gesetzt ist.
	 * @return False, wenn eine Stelle im Feld noch nicht belegt ist, ansonsten true.
	 */
	public boolean gameEnd() {
		for (int i = 0; i < field.length-1; i++) {
			if(field[i] == SYMBOL_NOT_SET) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Gibt true zurück, wenn der Spieler mit dem Symbol symbol gewonnen hat.
	 * @param symbol Symbol des Spielers
	 * @return true, wenn der Spieler gewonnen hat, ansonsten false.
	 */
	public boolean hasWon(int symbol) {
		if(checkSpalte(symbol) || checkZeile(symbol)) {
			return true;
		}
		
		return false;
		
	}
	
	private boolean checkSpalte(int symbol) {
		for (int i = 0; i < 3; i++) {
			if(field[i] == field[i+3] && field[i+3] == field[i+6] && field[i] == symbol) {
				return true;
			}
		}
		return false;
	}

	
	private boolean checkDiagonale(int symbol) {
		if(field[0] == field[4] && field[4] == field[8] && field[8] == symbol) {
			return true;
		}
		
		if(field[2] == field[4] && field[4] == field[6] && field[6] == symbol) {
			return true;
		}
		
		return false;
	}
	
	
	private boolean checkZeile(int symbol) {
		for(int i = 0; i < 3; i++) {
			if(field[0+i*3] == symbol && field[1+i*3] == symbol && field[2+i*3] == symbol) {
				return true;
			}
		}
		return false;
	}



	/**
	 * @return the field Das 3x3-Feld
	 */
	public int[] getField() {
		return field;
	}

	
	
}
