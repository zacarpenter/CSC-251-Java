/* Zachary Carpenter
 * 2/2/2022
 * Inheritance Assignment - CruiseShip subclass file
 */
public class CruiseShip_Carpenter extends Ship_Carpenter {

	// properties
	public int _maxPassengers;
	
	// constructor
	public CruiseShip_Carpenter() {
		super();
		_maxPassengers = 0;
	}
	
	// setter for maxPassengers property - set the property to the maxP parameter
	public void setMaxPassengers(int maxP) {
		_maxPassengers = maxP;
	}
	
	// getter for maxPassengers property
	public int getMaxPassengers() {
		return _maxPassengers;
	}
	
	// method returns the cost for a vacationer based on the max num of passengers
	public String costPP(int max) {
		String costPerPerson = "$0";
		
		if (max >= 1000) {
			costPerPerson = "$500";
		}
		else if (max >= 500) {
			costPerPerson = "$750";
		}
		else {
			costPerPerson = "$1000";
		}
		
		// return the cost per person string
		return costPerPerson;
	} 
} // end subclass
