package case1_tictactoe;

public class Paper {
	private char[][] paper = 
	{
	  {'-','-','-'},
	  {'-','-','-'},
	  {'-','-','-'}	
	};
	
	public void fillPaper(Position fillPosition, Player player) {
		int row = fillPosition.getRow();
		int col = fillPosition.getCol();
		char symbol = player.getSymbol();
				
		paper[row][col]=symbol;
	}
	
	public void printPaper() {
		for(char[] row: paper) {
			for(char col: row) {
				System.out.print(col);
			}
			System.out.println("");
		}
	}
	
	public char[][] getPaper() {
		return paper;
	}
}
