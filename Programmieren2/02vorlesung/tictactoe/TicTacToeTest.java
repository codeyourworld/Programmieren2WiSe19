package tictactoe;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class TicTacToeTest {


	@Test
	void testSetSymbol() {
		TicTacToe ticTacToe = new TicTacToe();
		
		for(int i = 0; i < 9; i++) {
			assertTrue(ticTacToe.setSymbol(TicTacToe.SYMBOL_O, i));
		}
		
		for(int i = 0; i < ticTacToe.getField().length; i++) {
			assertEquals(TicTacToe.SYMBOL_O, ticTacToe.getField()[i]);
		}
		
		for(int i = 0; i < 9; i++) {
			assertFalse(ticTacToe.setSymbol(TicTacToe.SYMBOL_O, i));
		}
		

	}

}
