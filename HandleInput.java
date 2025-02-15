package case1_tictactoe;
import java.util.Scanner;

public class HandleInput {
	private static Scanner scanner = new Scanner(System.in);
	private static Position position;
	
	public static Position scan(char symbol, Paper paper) {
		do{
			do {
				System.out.printf("Player %d move: ", symbol=='O'?1:2);
				
				int col = scanner.nextInt();
				int row = scanner.nextInt();
				
				position = new Position(col, row);
				
			} while(!validBound());
		}while(!validSpace(paper));
		
		return position;
	}
	
	private static boolean validBound() {
		if(position.getRow()<=2 && position.getRow()>=0 && position.getCol()<=2 && position.getCol()>=0) return true;
		else {
			System.out.println("ERROR: row/column is out of bound!");
			return false;
		}
	}
	
	private static boolean validSpace(Paper paper_) {
		char paper[][] = paper_.getPaper();
		
		if(paper[position.getRow()][position.getCol()]=='-') return true;
		else {
			System.out.println("ERROR: that is not an empty space!");
			return false;
		}
	}
	
}
