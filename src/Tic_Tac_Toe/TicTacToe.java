package Tic_Tac_Toe;

public class TicTacToe {
	/*
	 * creating method with size 10
	 */
	public static char[] createBoard()
	{
		//creating array with size 10 
		char[] board=new char[10];
		for(int i=1;i<board.length;i++) {
			board[i]=' ';
		}
		return board;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe Game...");
		//calling createBoard method in main method		 
		char[] board = createBoard();
	}
}
