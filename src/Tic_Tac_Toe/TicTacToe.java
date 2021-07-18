package Tic_Tac_Toe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TicTacToe {
	
	static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
	static ArrayList<Integer> systemPositions = new ArrayList<Integer>();
	
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
		String result = checkWinner();
		System.out.println(result);
				
		
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
		//change turn
		for(int i=1; i<=9; i++)
		{
			if(turn % 2 == 0) {
				System.out.println("Player turn...");	
				move = 'X';
				System.out.println("Enter your position 1-9");
				position = Utility.getUserInteger();
				playerPositions.add(position);
			}
			else {
				System.out.println("System turn...");
				move = 'O';
				Random r1 = new Random();
				position = r1.nextInt(9)+1;	
				systemPositions.add(position);
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
		
		
	}
	/*
	 * check winner
	 */
	public static String checkWinner() {
		List topRow = Arrays.asList(1,2,3);
		List middleRow = Arrays.asList(4, 5, 6);
		List bottomRow = Arrays.asList(7, 8, 9);
		List leftCol = Arrays.asList(1, 4, 7);
		List middleCol = Arrays.asList(2, 5, 8);
		List rightCol = Arrays.asList(3, 6, 9);
		List cross1 = Arrays.asList(1, 5, 9);
		List cross2 =Arrays.asList(3, 5, 7);
		
		List<List> winning = new ArrayList<List>();
		winning.add(topRow);
		winning.add(middleRow);
		winning.add(bottomRow);
		winning.add(leftCol);
		winning.add(middleCol);
		winning.add(rightCol);
		winning.add(cross1);
		winning.add(cross2);
		
		for(List l : winning) {
			if(playerPositions.containsAll(l)) {
				return "congrats you won";
			}
			else if(systemPositions.containsAll(l)) {
				return "System won";
			}
			else if(playerPositions.size() + systemPositions.size() == 9) {
				return "Tie";
			}
		}
		
		return "";
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
