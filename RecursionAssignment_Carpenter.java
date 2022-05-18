/*
 * Zachary Carpenter
 * 1/19/2022
 * Week 2 - Recursion Assignment
 * 
 * Write a recursive method that accepts a string as its argument and prints the 
 * string in reverse order. Demonstrate the recursive method in a program that 
 * asks the user for input and prints out its reverse.
 * 
 * For example:
 * Input sentence: The dog jumped over the fence
 * Reverse: ecnef eht depmuj god ehT
 */

import java.util.Scanner;
public class RecursionAssignment_Carpenter {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String userInput = "";
		
		// get user input
		System.out.println("Enter a sentence: ");
		userInput = input.nextLine();

		System.out.println("\nReversed String: ");
		// call static method
		System.out.println(reverseString(userInput));
		
		input.close();
	}
	
	/**
	 * reverseString takes a user string argument and returns the value of the
	 * string in reverse order 
	 * @param str is the user input string
	 * @return calls reverseString which gets the substring of str at position 1
	 * then it appends str charAt position 0, continues doing this until str 
	 * is empty
	 */
	public static String reverseString(String str) {
		
		// check if the parameter holds a value
		if (str.isEmpty()) {
			return str;
		}
		
		return reverseString(str.substring(1)) + str.charAt(0);
	}

}
