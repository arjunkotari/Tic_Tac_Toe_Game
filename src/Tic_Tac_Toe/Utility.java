package Tic_Tac_Toe;
import java.util.Scanner;
public class Utility {
	
	/**
	* Scanner which can parse primitive types and strings
	*/
	private static final Scanner scan = new Scanner(System.in);
	/**
	* Scanning of User input which is integer type
	* @return assigned integer value
	*/
	public static int getUserInteger() {
	return scan.nextInt();
	}
	/**
	* Scanning of User input which is character type
	* @return assigned single character
	*/
	public static char getUserChar() {
	return scan.next().charAt(0);
	}
	
	public static String getUserEnter() {
		return scan.nextLine();
	}

}
