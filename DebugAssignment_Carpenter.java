/*
 * Zachary Carpenter
 * 1/11/2022
 * Week 1 - Debugging Assignment
 */
import java.util.Scanner;
//This program finds the average of three input values.
public class DebugAssignment_Carpenter {
	
	public static void main(String [] args) {
		
		// declare variables
		double number1, number2, number3, average;
		
		// input data
		Scanner input = new Scanner(System.in);
		
		System.out.print( "Number 1? " );
		number1 = input.nextDouble();
		
		System.out.print( "Number 2? " );
		number2 = input.nextDouble();
		
		System.out.print( "Number 3? " );
		number3 = input.nextDouble();
		
		// calculate average
		average = (number1 + number2 + number3) / 3;
		
		// print results
		System.out.print(number1 + ", " + number2 + " & " + number3);
		System.out.println(" averages to " + average);
		
		input.close();
	}
}