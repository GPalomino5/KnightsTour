public class Knights{
	
	public static void main(String[] args){

		int [][] board;

		board = new int [8][8];

		for ( int i=0; i<8; i++){
			for (int j=0; j<8; j++){
				board[i][j]=0;
			}
		}

		int move = 1;
		int row = 0;
		int col = 0;

		board[row][col] = move;
		move++;
		getnextposition(row, col, move, board);

		printboard(board);

	}

	public static boolean getnextposition(int r, int c, int move, int [][]board){

		if (move != 65){
			
			System.out.println("Current position:    " + r + "   " + c);
			if (r+2 <= 7 && c+1 <= 7 && board [r+2][c+1]==0){

				r += 2;
				c += 1;
				board[r][c] = move;
				move++;

				if(getnextposition(r,c,move,board)){

					return true;

				} else{
					board[r][c] = 0;
					r -= 2;
					c -= 1;
					move--;
				}
			}

			if (r+1 <=7 && c+2 <=7 && board[r+1][c+2]==0){
				r += 1;
				c += 2;
				board[r][c]=move;
				move++;
				if(getnextposition(r, c, move, board)){
					return true;
				}else {
					board [r][c]=0;
					r -= 1;
					c -= 2;
					move--;
				}
			}

			if (r-1>=0 && c+2 <=7 && board[r-1][c+2]==0){
				r -= 1;
				c += 2;
				board[r][c]=move;
				move ++;
				if (getnextposition(r, c, move, board)){
					return true;
				} else {
					board[r][c] = 0;
					r += 1;
					c -= 2;
					move --;
				}
			}

			if (r-2>=0 && c+1 <= 7 && board[r-2][c+1]==0){
				r -= 2;
				c += 1;
				board[r][c] = move;
				move++;
				if ( getnextposition(r, c, move, board)){
					return true;
				} else {
					board[r][c] = 0;
					r += 2;
					c -= 1;
					move--;
				}
			}

			if (r-2>=0 && c-1>=0 && board[r-2][c-1]==0){
				r -= 2;
				c -= 1;
				board[r][c] = move;
				move++;
				if ( getnextposition(r, c, move, board)){
					return true;
				} else {
					board[r][c] = 0;
					r += 2;
					c += 1;
					move--;
				}
			}

			if (r-1 >=0 && c-2>=0 && board[r-1][c-2]==0){
				r -= 1;
				c -= 2;
				board[r][c] = move;
				move++;
				if( getnextposition(r, c, move, board)){
					return true;
				} else{
					board[r][c] = 0;
					r += 1;
					c += 2;
					move--;
				}
			}

			if( r+1<=7 && c-2>=0 && board[r+1][c-2]==0 ){
				r += 1;
				c -= 2;
				board[r][c] = move;
				move++;

				if( getnextposition(r, c, move, board)){
					return true;
				} else {
					board[r][c] = 0;
					r -= 1;
					c += 2;
					move--;
				}
			}

			if( r+2<=7 && c-1>=0 && board[r+2][c-1]==0 ){
				r += 2;
				c -= 1;
				board[r][c] = move;
				move++;
				if( getnextposition(r, c, move, board)){
					return true;
				} else {
					board[r][c] = 0;
					r -= 2;
					c += 1;
					move --;
				}
			}

			System.out.println(r + "   " + c);
			return false;
		} else return true;
	}

	public static void printboard(int [][] board){

		for ( int i = 0; i < 8; i++){

			for ( int j =0; j < 8; j++){

				if (board [i][j] < 10){
					System.out.print( " ");
				}

				System.out.print(board[i][j] + "  ");
			}

			System.out.println();
		}
	}
}