package Tic_Tac_Toe;

import java.util.Random;

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
		int user=1;
		//calling createBoard method in main method		 
		char[] board = createBoard();
		allowPlayer();
		//calling showBoard method
		showBoard();
		
	}
	/*
	 * creating a method to display the board
	 */
	public static void showBoard() {
		char[][] gameBoard = {{' ','|',' ','|',' '},
				{'-','+','-','+','-'},
				{' ','|',' ','|',' '},
				{'-','+','-','+','-'},
				{' ','|',' ','|',' '}};
		for(char[] row:gameBoard) {
			for(char display:row) {
				System.out.print(display);
			}
			System.out.println();
		}
	}
	/*
	 * Creating method to allow player to input X or O
	 */
	public static char allowPlayer() {
		System.out.println("Please enter X or O");
		char playerMove =Utility.getUserChar();
		return playerMove;
	}
}
