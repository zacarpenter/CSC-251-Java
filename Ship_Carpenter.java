/* Zachary Carpenter
 * 2/2/2022
 * Inheritance Assignment - Ship class file
 */
public class Ship_Carpenter {

	// properties
	public String _name;
	public String _year;
	
	// constructor initializes an empty string
	public Ship_Carpenter() {
		_name = "";
		_year = "";
	}
	
	// setter for name property - set the property to the name parameter
	public void setName(String name) {
		_name = name;
	}
	
	// getter for name property
	public String getName() {
		return _name;
	}
	
	// setter for year property - set the property to the year parameter
	public void setYear(String year) {
		_year = year;
	}
	
	// getter for year property
	public String getYear() {
		return _year;
	}

} // end class