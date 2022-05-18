/* Zachary Carpenter
 * 2/10/2022
 * Map assignment - imports a text file and reads its contents. Totals the
 * occurrence of each word.
 */

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Map_Carpenter {

	public static void main(String[] args) throws IOException {
		
		// create hashmap
		Map<String, Integer> hm = new HashMap<>();
		
		// create Scanner obj and read in file
		Scanner file = new Scanner(new File("gettys.txt"));
		
		// read the entire file into a variable
		String line = "";
		
		// loop to read each line
		while (file.hasNextLine()) {
			
			// store the line in a variable
			line = line + file.nextLine().toLowerCase();
			
			// split the line into an array of words with a regex
			String[] words = line.replaceAll("\\p{Punct}", "").toLowerCase().split(" ");
			
			// for each word in the array of words
			for (String word : words) {

				// if the hashmap contains the key
				if (hm.containsKey(word)) {
					// iterate that key
					hm.put(word, hm.get(word) + 1);
				}
				else {
					// else add the key with initial value of 1
					hm.put(word, 1);
				}
				
			} // end for
			
		} // end while
		
		// testing
		//System.out.println(hm);
		
		// create treemap to sort by keys
		Map<String, Integer> tm = new TreeMap<>(hm);
		
		// for each key print the key and value
		for (String key : tm.keySet()) {
			System.out.printf("'%s' => Total Occurrences: %d\n\n", key, tm.get(key));
			//System.out.println(key); // alternate print
		}

	} // end main

} // end class