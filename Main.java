package case1_tictactoe;

public class Main {
	
	public Main(){
		Player player1 = new Player('X');
		Player player2 = new Player('O');
		
		Paper paper = new Paper();
		
		GameWin status = new GameWin();
		
		paper.printPaper();
		
		Player turn;
		for(int i=1; i<=9; i++) {
			if(i%2==0) turn=player1;
			else turn=player2;
		
			Position position=HandleInput.scan(turn.getSymbol(), paper);
			
			paper.fillPaper(position, turn);
			paper.printPaper();
			
			if(status.getStatus(paper)) {
				System.out.printf("Player %d Win!!!\n", i%2==0?1:2);
				return;
			}
		}
		System.out.println("Draw!!!\n");
	}
	
	public static void main(String[] args) {
		new Main();
	}
	
}
