/* Zachary Carpenter
 * 1/26/2021
 * Data Manipulation Assignment
 */

// Needed for JDBC classes
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeTableViewer_Carpenter {

	public static void main(String[] args) {
		// Create a named constant for the URL.
		// NOTE: This value is specific for Java DB.
		final String DB_URL = "jdbc:derby:DTEMPLOYEESDB;create=true";

		try
		{
			// Create a connection to the database.
			Connection conn = DriverManager.getConnection(DB_URL);

			// view data
			viewEmployeeTable(conn);
			
			// modify record
			modEmployeeTable(conn);
			
			viewEmployeeTable(conn);
			
			// Close the connection.
			conn.close();

		}
		catch (Exception ex)
		{
			System.out.println("ERROR: " + ex.getMessage());
		}


	}  // end main



	public static void viewEmployeeTable(Connection conn)
	{
		//create var for result set
		ResultSet resultset = null;

		try
		{
			// Get a Statement object.
			Statement stmt = conn.createStatement();

			// View the table.
			resultset = stmt.executeQuery("SELECT * FROM Employee");

			// process results
			ResultSetMetaData metaData = resultset.getMetaData();
			
			System.out.println("Data from Employee Table:");

			int numberOfColumns = metaData.getColumnCount();
			// for loop to field names
			for (int i = 1; i <= numberOfColumns; i++){
				System.out.printf("%s\t\t", metaData.getColumnName(i));
			}
			System.out.println();
			
			// while loop to display data
			while (resultset.next()){
				for (int i = 1; i <= numberOfColumns; i++){
					System.out.printf("%s\t", resultset.getObject(i));
				}
				System.out.println();
			}

		}
		catch (SQLException ex)
		{
			System.out.println("ERROR: " + ex.getMessage());
		}
	}	


	public static void modEmployeeTable(Connection conn)
	{
		//create var for result set
		//ResultSet resultset = null;

		try
		{
			// Get a Statement object.
			Statement stmt = conn.createStatement();

			// Update Tom Brady so that his department is History
			stmt.executeUpdate("UPDATE Employee SET Department = 'History' WHERE Emp_ID = '890101030'");
			System.out.println("Department updated");
			
			// Update Peyton Manning so that his first name is changed to William and hourly wage is 55.15 (this can be done in one statement)
			stmt.executeUpdate("UPDATE Employee SET FirstName = 'William', HourlyWage = 55.15 WHERE Emp_ID = '129020202'");
			System.out.println("First Name and Hourly Wage updated");
			
			// Update Aaron Rodgers so that his last name is changed to Hank
			stmt.executeUpdate("UPDATE Employee SET LastName = 'Hank' WHERE Emp_ID = '980191919'");
			System.out.println("Last Name updated");
			
			// Delete Eli Manning
			stmt.executeUpdate("DELETE FROM Employee WHERE Emp_ID = '807223230'");
			System.out.println("Record deleted");

		}
		catch (SQLException ex)
		{
			System.out.println("ERROR: " + ex.getMessage());
		}
	}	

} // end class
