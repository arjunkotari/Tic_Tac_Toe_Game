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
		int user=1,position;
		char[][] gameBoard = {{' ','|',' ','|',' '},
				{'-','+','-','+','-'},
				{' ','|',' ','|',' '},
				{'-','+','-','+','-'},
				{' ','|',' ','|',' '}};
		//calling createBoard method in main method		 
		showBoard(gameBoard);
		char[] board = createBoard();
		//allowPlayer();
		//calling showBoard method
		System.out.println("Enter your position 1-9");
		position = Utility.getUserInteger();
		makeMove(gameBoard, position);
		showBoard(gameBoard);
				
		
	}
	/*
	 * placing moves into specific position
	 * If the place is free then place the X
	 */
	public static void makeMove(char[][] gameBoard, int position) {
		
		switch(position) {
		case 1:
			if(gameBoard[0][0] != 'X') {
				gameBoard[0][0] = 'X';
			}	
			else
				System.out.println("Position full...");
			break;
		case 2:
			if(gameBoard[0][2] != 'X') {
				gameBoard[0][2] = 'X';
			}	
			else
				System.out.println("Position full...");
			break;
		case 3:
			if(gameBoard[0][4] != 'X') {
				gameBoard[0][4] = 'X';
			}	
			else
				System.out.println("Position full...");
			break;
		case 4:
			if(gameBoard[2][0] != 'X') {
				gameBoard[2][0] = 'X';
			}	
			else
				System.out.println("Position full...");
			break;
		case 5:
			if(gameBoard[2][2] != 'X') {
				gameBoard[2][2] = 'X';
			}	
			else
				System.out.println("Position full...");
			break;
		case 6:
			if(gameBoard[2][4] != 'X') {
				gameBoard[2][4] = 'X';
			}	
			else
				System.out.println("Position full...");
			break;
		case 7:
			if(gameBoard[4][0] != 'X') {
				gameBoard[4][0] = 'X';
			}	
			else
				System.out.println("Position full...");
			break;
		case 8:
			if(gameBoard[4][2] != 'X') {
				gameBoard[4][2] = 'X';
			}	
			else
				System.out.println("Position full...");
			break;
		case 9:
			if(gameBoard[4][4] != 'X') {
				gameBoard[4][4] = 'X';
			}	
			else
				System.out.println("Position full...");
			break;
		default:
			break;
		}
	}
	/*
	 * creating a method to display the board
	 */
	public static void showBoard(char[][] gameBoard) {
		
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
		System.out.println("Please enter X");
		char playerMove =Utility.getUserChar();
		return playerMove;
	}
}
