package case1_tictactoe;

public class GameWin {
	private boolean status=false;
	
	public boolean getStatus(Paper paper_) {
		char[][] paper=paper_.getPaper();
		
		if(paper[0][0]!='-'&&
		   paper[0][0]==paper[1][1]&&
		   paper[0][0]==paper[2][2]) status=true;
		else if(
		   paper[2][0]!='-'&&
		   paper[2][0]==paper[1][1]&&
		   paper[2][0]==paper[0][2]) status=true;	
		else {
			for(int i=0; i<3; i++) {
				if((paper[0][i]!='-'&&
					paper[0][i]==paper[1][i]&&
				    paper[0][i]==paper[2][i])||
				   (paper[i][0]!='-'&&
				    paper[i][0]==paper[i][1]&&
				    paper[i][0]==paper[i][2])) {
					status=true; break;
				}
			}
		}
		
		return status;
	}
}
