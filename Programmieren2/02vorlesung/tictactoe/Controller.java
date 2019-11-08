package tictactoe;

import java.util.Scanner;

/**
 * Der Controller kümmert sich um die Usereingabe und entscheidet was damit passieren soll, damit der Benutzer TicTacToe spielen kann. In dieser Klasse laufen alle Fäden zusammen.
 * @author Stephi
 * @version 1.0
 */
public class Controller {

	
	/**
	 * Ein neues Spiel beginnt. Dem Benutzer wird das 3x3-Spielfeld angezeigt und er bekommt die Aufforderung sein Symbol zu setzen. Hat er dies getan, wird geprüft, ob die Eingabe richtig war. Der Spieler wird solange aufgefordert eine neue Eingabe zu tätigen bis diese richtig ist. Falls der Spieler gewonnen hat wird dies ausgegeben und das Spiel ist zu Ende. Ebenso falls alle Felder mit Symbolen besetzt sind, aber keiner gewonnen hat.
	 */
	public void gameLoop() {
		View view = new View();
		TicTacToe ticTacToe = new TicTacToe();
		boolean toggleUser = false;		
		Scanner input = new Scanner(System.in);
		boolean gameEnd = false;
		
		while(!gameEnd) {
			view.drawGameField(ticTacToe.getField());
			view.showOutput(toggleUser? "X" : "O");		
			int number = input.nextInt();

			while(!ticTacToe.setSymbol(toggleUser? TicTacToe.SYMBOL_X : TicTacToe.SYMBOL_O, number)) {
				view.showOutput(toggleUser? "X" : "O");			
				number = input.nextInt();		
			}
			
			if(ticTacToe.hasWon(toggleUser? TicTacToe.SYMBOL_X : TicTacToe.SYMBOL_O)) {
				view.showWinner(toggleUser? "X" : "O");
				gameEnd = true;
			} 
			else if(ticTacToe.gameEnd()) {
				view.showGameEnd();
				gameEnd = true;				
			}
			
			toggleUser = !toggleUser;			
			
		}
		

		input.close();
	}

	
}
