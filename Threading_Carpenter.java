/* Zachary Carpenter
 * 2/15/2022
 * Threading Assignment -
 */

/*
 * Create a rock, paper, scissors threading program to do the following:

1. Start a thread for a process to simulate a person throwing a rock, paper, or scissors 1000 times (use random 1-3). 

2. Start another thread for a process to simulate a computer throwing a rock, paper, or scissors 1000 times (use random 1-3). 

*** For our example, 1 means rock, 2 means paper, 3 means scissors ***

3. Store the throws (1, 2, or 3) for user and computer in an array(s).

4. Display on screen when the computer and user threads start, what was thrown, and when the threads end.

5. Once throw processes are completed for both computer and user, use the array(s) you populated above to count number of computer wins, number of user wins, and ties. Each element of one array is compared to each element in the other array by index. So computerThrow[0] is compared to userThrow[0], etc.

To determine winner, 2 beats 1 (paper beats rock), 3 beats 2 (scissors beats paper), and 1 beats 3 (rock beats scissors).

Display the number of wins for each as well as ties.
 */
import java.util.*;
public class Threading_Carpenter {

	public static void main(String[] args) {
		RPS p1 = new RPS("Player");
		RPS comp = new RPS("Computer");
		
		// start the threads
		p1.start();
		comp.start();
		
		// call win/loss/draw and print results to the console
		p1.wld();
		
	}

}

class RPS extends Thread {
	
	// fields
	private Thread t;
	private String threadName;
	private static int[] playerThrow = new int[1000];
	private static int[] compThrow = new int[1000];
	private int playerWins = 0;
	private int compWins = 0;
	private int draws = 0;
	
	// constructor
	public RPS(String name) {
		threadName = name;
		System.out.printf("Creating: %s thread\n\n", threadName);
	}
	
	// Starts thread, then invokes the run() method on this Thread object
	public void start() {
		System.out.printf("Starting: %s thread\n\n", threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
		try { // join the threads to allow player to finish throwing before computer starts
			t.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	} // end start
	
	// run
	public void run() {
		System.out.printf("Running: %s thread\n\n", threadName);
		
		// create Random object
		Random rand = new Random();
		
		for(int i = 0; i < playerThrow.length; i++) {
			
			if (threadName.equals("Player")) {
				// assign playerN a value between 1-3
				int playerN = rand.nextInt(3) + 1;
				System.out.printf("%s throw #%d - %d\n", threadName, i+1, playerN);
				// add player's throw to array
				playerThrow[i] = playerN;
			}
			else {
				// assign compN a value between 1-3
				int compN = rand.nextInt(3) + 1;
				System.out.printf("%s throw #%d - %d\n", threadName, i+1, compN);
				// add computer's throw to array
				compThrow[i] = compN;
			}
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		System.out.printf("Thread: %s exiting\n\n", threadName);
		
	} // end run
	
	
	public void wld() {
		
		// loop through the player throw array and compare the value to the computer throw value
		for (int i : playerThrow) {
			// check who won
			if (playerThrow[i] != compThrow[i]) {
				if (playerThrow[i] == 1 && compThrow[i] == 2) {
					compWins++;
				}
				else if (playerThrow[i] == 1 && compThrow[i] == 3) {
					playerWins++;
				}
				else if (playerThrow[i] == 2 && compThrow[i] == 1) {
					playerWins++;
				}
				else if (playerThrow[i] == 2 && compThrow[i] == 3) {
					compWins++;
				}
				else if (playerThrow[i] == 3 && compThrow[i] == 1) {
					compWins++;
				}
				else if (playerThrow[i] == 3 && compThrow[i] == 2) {
					playerWins++;
				} 
			} 
			else { // else go to a draw
				draws++;
			}
		}
				
		// display results
		System.out.printf("Number of Draws: %d\n", draws);
		System.out.printf("Number of Player wins: %d\n", playerWins);
		System.out.printf("Number of Computer wins: %d\n", compWins);
		
	} // end winLossDraw
	
} // end RPS