/*
 * Zachary Carpenter
 * 3/16/2022
 * Purpose: Reads a text file into a linked list and performs various actions.
 */

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.*;

public class CarpenterLinkedList {

	public static void main(String[] args) throws FileNotFoundException {
		
		// create new linked list object
		LinkedList<String> gettys = new LinkedList<String>();
		
		// read file into Scanner
		Scanner gettysFile = new Scanner(new File("gettys.txt"));
		
		// loop through each word in the gettys file
		while(gettysFile.hasNext()) {
			// add each word as a node to the LinkedList 
			gettys.add(gettysFile.next().replaceAll("\\p{Punct}", ""));
		}
		
		
		// Print the entire object
		System.out.println("Original Linked List: " + gettys);
		
		
		/*
		 * Add the words: 
		 * "If you want to know what a person is like take a good look at how the person treats inferiors not equals"
		 * to the end of the linked list.
		 */
		
		String sentence = "If you want to know what a person is like take a good look at how the person treats inferiors not equals";
		String[] words = sentence.split(" ");
		for(String word: words) {
			gettys.addLast(word);
		}
		
		
		// Remove the 6th word - "ago"
		gettys.remove(5);
		
		
		// Replace all occurrences of the word "nation" to "country"
		Collections.replaceAll(gettys, "nation", "country");

		
		// Replace all occurrences of the word "that" to "this"
		Collections.replaceAll(gettys, "that", "this");
		
		
		// Remove all occurrences of the word "and"
		
		// create iterator
		Iterator<String> rIterator = gettys.iterator();
		// loop through while the iterator has a value
		while(rIterator.hasNext()) {
			// create an object so I can modify the iterator
			Object removal = rIterator.next();
			// if the object equals "and" remove that instance of the iterator
			if(removal.equals("and")) {
				rIterator.remove();
			}
		}
		
		
		// Print out the entire object again to view all changesPrint out the entire object again to view all changes
		System.out.println("Final Linked List:    " + gettys);
		
		
		// close Scanner resource
		gettysFile.close();

	}

}
