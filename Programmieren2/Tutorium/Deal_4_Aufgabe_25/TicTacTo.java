package Deal_4_Aufgabe_25;

public class TicTacTo {
	int[][] field = new int[3][3];
	int currentPlayer=0;

	public boolean checkWin() {

		if (field[0][0] == field[1][1] && field[1][1] == field[2][2])
			return true;

		if (field[0][2] == field[1][1] && field[1][1] == field[2][0])
			return true;

		for (int i = 0; i < field.length; i++) {
			if (field[i][0] > 0) {
				if (field[i][0] == field[i][1] && field[i][1] == field[i][2])
					return true;

				if (field[0][i] == field[1][i] && field[1][i] == field[2][i])
					return true;

			}
		}
		return false;

	}
	
	public boolean checkEnd() {
		if (this.checkWin())
			return true;
		else {
			for(int i=0;i<field.length;i++) {
				for(int j=0;j<field.length;j++) {
					if (field[i][j]==0)
						return false;
				}
			}
			return true;
		}
		
	}
	
	public int getCurrPlayer() {
		return currentPlayer;
	}
	
}
