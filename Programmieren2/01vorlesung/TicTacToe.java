import java.util.Random;

public class TicTacToe {

	
	public static void main(String[] args) {
		
		int [] ttt = new int[9];
		Random random = new Random();
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				ttt[i*3 + j] = random.nextInt(3);
				System.out.print(ttt[i*3 + j] + " | ");
			}
			System.out.println("\n-----------");
		}
		
		checkZeile(ttt, 1);
		checkZeile(ttt, 2);

		checkSpalte(ttt, 1);
		checkSpalte(ttt, 2);			
		
		checkDiagonale(ttt, 1);
		checkDiagonale(ttt, 2);

	}

	private static void checkSpalte(int[] ttt, int symbol) {
		for (int i = 0; i < 3; i++) {
			if(ttt[i] == ttt[i+3] && ttt[i+3] == ttt[i+6] && ttt[i] == symbol) {
				System.out.println("Spieler 1 hat gewonnen");
			}
		}
	}

	
	private static void checkDiagonale(int[] ttt, int symbol) {
		if(ttt[0] == ttt[4] && ttt[4] == ttt[8] && ttt[8] == symbol) {
			System.out.println("Spieler " + symbol + " hat gewonnen");
		}
		
		if(ttt[2] == ttt[4] && ttt[4] == ttt[6] && ttt[6] == symbol) {
			System.out.println("Spieler " + symbol + " hat gewonnen");
		}
	}
	
	
	private static void checkZeile(int[] ttt, int symbol) {
		for(int i = 0; i < 3; i++) {
			symbol = 1;
			if(ttt[0+i*3] == symbol && ttt[1+i*3] == symbol && ttt[2+i*3] == symbol) {
				System.out.println("Spieler 1 hat gewonnen");
			}
		}
	}
	
}
