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
		makeMove(gameBoard,turn,position,board);
		
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
	public static void makeMove(char[][] gameBoard,int turn,int position, char[] board) {
		char move;
		if(turn == 1)
		{
			turn = 2;
		}
		else if(turn == 0) {
			turn =1;
		}
		//change turn
		for(int i=1; i<=9; i++)
		{
			if(turn % 2 == 0) {
				System.out.println("Player turn...");	
				move = 'X';
				System.out.println("Enter your position 1-9");
				position = Utility.getUserInteger();
				//playerPositions.add(position);
			}
			else {
				System.out.println("System turn...");
				move = 'O';
				Random r1 = new Random();
				position = r1.nextInt(9)+1;	
				//systemPositions.add(position);
			}
			turn++;
			
			
			switch(position) {
			case 1:
				if(gameBoard[0][0] != 'X' && gameBoard[0][0] != 'O') {
					gameBoard[0][0] = move;
					board[1]=move;
				}	
				else {
					System.out.println("Position full...");
					i--;
					turn--;
				}
					
				break;
			case 2:
				if(gameBoard[0][2] != 'X' && gameBoard[0][2] != 'O') {
					gameBoard[0][2] = move;
					board[2]=move;
				}	
				else {
					System.out.println("Position full...");
					i--;
					turn--;
				}
				break;
			case 3:
				if(gameBoard[0][4] != 'X' && gameBoard[0][4] != 'O') {
					gameBoard[0][4] = move;
					board[3]=move;
				}		
				else {
					System.out.println("Position full...");
					i--;
					turn--;
				}
				break;
			case 4:
				if(gameBoard[2][0] != 'X' && gameBoard[2][0] != 'O') {
					gameBoard[2][0] = move;
					board[4]=move;
				}	
				else {
					System.out.println("Position full...");
					i--;
					turn--;
				}
				break;
			case 5:
				if(gameBoard[2][2] != 'X' && gameBoard[2][2] != 'O') {
					gameBoard[2][2] = move;
					board[5]=move;
				}	
				else {
					System.out.println("Position full...");
					i--;
					turn--;
				}
				break;
			case 6:
				if(gameBoard[2][4] != 'X' && gameBoard[2][4] != 'O') {
					gameBoard[2][4] = move;
					board[6]=move;
				}		
				else {
					System.out.println("Position full...");
					i--;
					turn--;
				}
				break;
			case 7:
				if(gameBoard[4][0] != 'X' && gameBoard[4][0] != 'O') {
					gameBoard[4][0] = move;
					board[7]=move;
				}		
				else {
					System.out.println("Position full...");
					i--;
					turn--;
				}
				break;
			case 8:
				if(gameBoard[4][2] != 'X' && gameBoard[4][2] != 'O') {
					gameBoard[4][2] = move;
					board[8]=move;
				}
				else {
					System.out.println("Position full...");
					i--;
					turn--;
				}
				break;
			case 9:
				if(gameBoard[4][4] != 'X' && gameBoard[4][4] != 'O') {
					gameBoard[4][4] = move;
					board[9]=move;
				}		
				else {
					System.out.println("Position full...");
					i--;
					turn--;
				}
				break;
			default:
				break;
			}
			showBoard(gameBoard);
			/*
			 * check winner
			 */
			if(gameBoard[0][0]=='X' && gameBoard[0][2]=='X' && gameBoard[0][4]=='X' )
			{
				System.out.println("You own the game");
				break;
			}
			else if(gameBoard[2][0]=='X' && gameBoard[2][2]=='X' && gameBoard[2][4]=='X' )
			{
				System.out.println("You own the game");
				break;
			}
			else if(gameBoard[4][0]=='X' && gameBoard[4][2]=='X' && gameBoard[4][4]=='X' )
			{
				System.out.println("You own the game");
				break;
			}
			
			else if(gameBoard[0][0]=='X' && gameBoard[2][0]=='X' && gameBoard[4][0]=='X' )
			{
				System.out.println("You own the game");
				break;
			}
			else if(gameBoard[0][2]=='X' && gameBoard[2][2]=='X' && gameBoard[4][2]=='X' )
			{
				System.out.println("You own the game");
				break;
			}
			else if(gameBoard[0][4]=='X' && gameBoard[2][4]=='X' && gameBoard[4][4]=='X' )
			{
				System.out.println("You own the game");
				break;
			}
			else if(gameBoard[0][0]=='X' && gameBoard[2][2]=='X' && gameBoard[4][4]=='X' )
			{
				System.out.println("You own the game");
				break;
			}
			else if(gameBoard[4][0]=='X' && gameBoard[2][2]=='X' && gameBoard[0][4]=='X' )
			{
				System.out.println("You own the game");
				break;
			}
			
			
			
			
			
			else if(gameBoard[0][0]=='O' && gameBoard[0][2]=='O' && gameBoard[0][4]=='O' )
			{
				System.out.println("System own the game");
				break;
			}
			else if(gameBoard[2][0]=='O' && gameBoard[2][2]=='O' && gameBoard[2][4]=='O' )
			{
				System.out.println("System own the game");
				break;
			}
			else if(gameBoard[4][0]=='O' && gameBoard[4][2]=='O' && gameBoard[4][4]=='O' )
			{
				System.out.println("System own the game");
				break;
			}
			
			else if(gameBoard[0][0]=='O' && gameBoard[2][0]=='O' && gameBoard[4][0]=='O' )
			{
				System.out.println("System own the game");
				break;
			}
			else if(gameBoard[0][2]=='O' && gameBoard[2][2]=='O' && gameBoard[4][2]=='O' )
			{
				System.out.println("System own the game");
				break;
			}
			else if(gameBoard[0][4]=='O' && gameBoard[2][4]=='O' && gameBoard[4][4]=='O' )
			{
				System.out.println("System own the game");
				break;
			}
			else if(gameBoard[0][0]=='O' && gameBoard[2][2]=='O' && gameBoard[4][4]=='O' )
			{
				System.out.println("System own the game");
				break;
			}
			else if(gameBoard[4][0]=='O' && gameBoard[2][2]=='O' && gameBoard[0][4]=='O' )
			{
				System.out.println("System own the game");
				break;
			}
			else if(i == 9)
			{
				System.out.println("Game Tie...");
				break;
			}
			
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
