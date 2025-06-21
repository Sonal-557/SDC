import java.sql.*;  // Importing the SQL package to handle database connectivity
import java.util.Scanner;  // Importing the Scanner class to take user input from the console

/**
 * The UpdateData class connects to a MySQL database, takes user input for a student record,
 * and updates the student information (name and address) based on the student ID.
 *
 * The program:
 * 1. Prompts the user for a student ID, name, and address.
 * 2. Builds an SQL UPDATE query with the provided data.
 * 3. Executes the query to update the student data in the database.
 * 4. Outputs a success message if the update is successful, or an error message if an exception occurs.
 */
public class UpdateData {
    
    /**
     * The main method is the entry point of the program.
     * It handles the connection to the database, gathering user input, and performing the data update.
     * 
     * @param args Command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        try (
            // Establish a connection to the MySQL database named "mydb"
            // The connection is made using the "root" user and the password "ace123"
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "sql@itself12");
            
            // Create a Statement object to execute SQL queries101
            Statement s = con.createStatement()
        ) {

            // Create a Scanner object to take user input from the console
            Scanner sc = new Scanner(System.in);
            
            // Display a message to inform the user about the update operation
            System.out.println("Update Data in student table:");
            System.out.println("________________________________________");
            
            // Prompting the user to enter the student ID for which the data needs to be updated
            System.out.print("Enter student id: ");
            int sid = sc.nextInt();  // Read the student ID as an integer

            // Prompting the user to enter the new student name
            System.out.print("Enter student name: ");
            String sname = sc.next();  // Read the student name as a string

            // Prompting the user to enter the new student address
            System.out.print("Enter student address: ");
            String saddr = sc.next();  // Read the student address as a string

            // Constructing the SQL UPDATE query to update the student record
            // The query will update the columns s_name and s_address for the student with the given s_id
            String updateQuery = "UPDATE student SET s_name='" + sname + "', s_address='" + saddr + "' WHERE s_id=" + sid;

            // Executing the UPDATE query using the executeUpdate() method of the Statement object
            // executeUpdate() is used for SQL commands that modify the database, like INSERT, UPDATE, DELETE
            s.executeUpdate(updateQuery);

            // Display a success message to the user after the data is updated successfully
            System.out.println("Data updated successfully");

        } catch (SQLException err) {
            // Catching any SQLException that occurs during database operations
            // Printing the error message if any issue occurs during the database connection or query execution
            System.out.println("ERROR: " + err);
        }
    }
}
