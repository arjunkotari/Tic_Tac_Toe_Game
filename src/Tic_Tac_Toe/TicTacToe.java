package Tic_Tac_Toe;

import java.util.Random;

public class TicTacToe {
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe Game...");
		int user=1,position=0;
		char playerMove = ' ';
		char[][] gameBoard = {{' ','|',' ','|',' '},
				{'-','+','-','+','-'},
				{' ','|',' ','|',' '},
				{'-','+','-','+','-'},
				{' ','|',' ','|',' '}};
		//calling createBoard method in main method		 
		showBoard(gameBoard);
		System.out.println("Choose Head or Tail. ");
		System.out.println("0:Head \n1:Tail");
		int toss = Utility.getUserInteger();
		char[] board = createBoard();
		
		Random r1 = new Random();
		int turn=r1.nextInt();
		//if random number is -ve then convert it into positive
		if(turn<0) {
			turn *= -1;
		}
		turn %= 2;		
		playerMove = allowPlayer(turn,playerMove,toss);
		//calling showBoard method
		
		makeMove(gameBoard,turn,position);
				
		
	}
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
	/*
	 * placing moves into specific position
	 * If the place is free then place the X
	 */
	public static void makeMove(char[][] gameBoard,int turn,int position) {
		char move;
		if(turn == 1)
		{
			turn = 2;
		}
		else if(turn == 0) {
			turn =1;
		}
		
		if(turn % 2 == 0) {
			System.out.println("Player turn...");	
			move = 'X';
			System.out.println("Enter your position 1-9");
			position = Utility.getUserInteger();
		}
		else {
			System.out.println("System turn...");
			move = 'O';
			Random r1 = new Random();
			position = r1.nextInt(9)+1;			
		}
		turn++;
		
		
		switch(position) {
		case 1:
			if(gameBoard[0][0] != 'X' && gameBoard[0][0] != 'O') {
				gameBoard[0][0] = move;					
			}	
			else {
				System.out.println("Position full...");
			}
				
			break;
		case 2:
			if(gameBoard[0][2] != 'X' && gameBoard[0][0] != 'O') {
				gameBoard[0][2] = move;
			}	
			else {
				System.out.println("Position full...");
			}
			break;
		case 3:
			if(gameBoard[0][4] != 'X' && gameBoard[0][0] != 'O') {
				gameBoard[0][4] = move;
			}		
			else {
				System.out.println("Position full...");
			}
			break;
		case 4:
			if(gameBoard[2][0] != 'X' && gameBoard[0][0] != 'O') {
				gameBoard[2][0] = move;
			}	
			else {
				System.out.println("Position full...");
			}
			break;
		case 5:
			if(gameBoard[2][2] != 'X' && gameBoard[0][0] != 'O') {
				gameBoard[2][2] = move;
			}	
			else {
				System.out.println("Position full...");
			}
			break;
		case 6:
			if(gameBoard[2][4] != 'X' && gameBoard[0][0] != 'O') {
				gameBoard[2][4] = move;
			}		
			else {
				System.out.println("Position full...");
			}
			break;
		case 7:
			if(gameBoard[4][0] != 'X' && gameBoard[0][0] != 'O') {
				gameBoard[4][0] = move;
			}		
			else {
				System.out.println("Position full...");
			}
			break;
		case 8:
			if(gameBoard[4][2] != 'X' && gameBoard[0][0] != 'O') {
				gameBoard[4][2] = move;
			}
			else {
				System.out.println("Position full...");
			}
			break;
		case 9:
			if(gameBoard[4][4] != 'X' && gameBoard[0][0] != 'O') {
				gameBoard[4][4] = move;
			}		
			else {
				System.out.println("Position full...");
			}
			break;
		default:
			break;
		}
		showBoard(gameBoard);
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
	public static char allowPlayer(int turn,char playerMove, int toss) {
		if(turn == toss) {
			System.out.println("you own the task...");
			playerMove='X';		
			
		}
		else {
			System.out.println("System own the task...");
			playerMove = 'O';
			
		}
		return playerMove;
	}
}
