package arrays;

public class EinfacheArrays {

	public static void main(String[] args) {
		
//		int[][] ttt = new int [3][3];
//		ttt[0][0] = 1;
//		ttt[0][1] = 1;
//		ttt[0][2] = 1;
//		
//		ttt[1][0] = 0;
//		ttt[1][1] = 0;
//		ttt[1][2] = 1;
//		
//		ttt[2][0] = 0;
//		ttt[2][1] = 1;
//		ttt[2][2] = 1;

		int [] numbers = {3, 5, 1, 6};
		int [][] ttt = {{1, 1, 1}, {0, 0, 1}, {0, 1, 1}};
		
		for(int y = 0; y < ttt.length; y++) {
			for(int x = 0; x < ttt[0].length; x++) {
				System.out.print(ttt[y][x] + " | ");
			}
			System.out.println("\n-----------");
		}
		
		
		
	}
	
}
