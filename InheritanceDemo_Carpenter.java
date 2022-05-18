/* Zachary Carpenter
 * 2/2/2022
 * Inheritance Assignment - program demo file
 */
import java.util.Scanner;
public class InheritanceDemo_Carpenter {

	public static void main(String[] args) {
		
		// create Scanner object
		Scanner kbd = new Scanner(System.in);
		
		// ask user for ship name and store value
		System.out.println("What is the name of the ship? ");
		String name = kbd.nextLine();
		
		// ask user for year built and store value
		System.out.println("What year was the ship built in? ");
		String year = kbd.nextLine();
		
		// ask user for max number of passengers and store value
		System.out.println("What is the max number of passengers for the ship? ");
		int max = kbd.nextInt();
		
		// create CruiseShip object to call its methods
		CruiseShip_Carpenter ship = new CruiseShip_Carpenter();
		
		// set name, year, and maxPassengers using stored values
		ship.setName(name);
		ship.setYear(year);
		ship.setMaxPassengers(max);
		
		// call costPP to get the cost per person	
		// print the results to console using the getters
		System.out.printf("Ship Name: %s\nYear Built: %s\nMax number of passengers: %d\nIndividual Cost: %s", ship.getName(), ship.getYear(), ship.getMaxPassengers(), ship.costPP(max));
		
		kbd.close();
	} // end main
}// end class