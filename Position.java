package case1_tictactoe;

public class Position {
	private int row;
	private int col;
	
	public Position(int col, int row){
		this.col=col;
		this.row=row;
	}
	
	public int getCol() {
		return col;
	}
	
	public int getRow() {
		return row;
	}
}
