import java.sql.*;  // Importing the SQL package to handle database connectivity
import java.util.Scanner;  // Importing the Scanner class to take user input from the console

/**
 * The DeleteData class connects to a MySQL database, takes user input for a student ID,
 * and deletes the student record from the `student` table based on the provided student ID.
 *
 * The program:
 * 1. Prompts the user for a student ID.
 * 2. Builds an SQL DELETE query using the student ID.
 * 3. Executes the query to delete the student data from the database.
 * 4. Outputs a success message if the deletion is successful or an error message if an exception occurs.
 */
public class DeleteData {

    /**
     * The main method is the entry point of the program.
     * It handles the connection to the database, gathering user input, and performing the data deletion.
     * 
     * @param args Command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        try (
            // Establishing a connection to the MySQL database named "mydb" on localhost
            // The connection is made using the "root" user and the password "ace123"
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "sql@itself12");
            
            // Creating a Statement object to execute SQL queries
            Statement s = con.createStatement()
        ) {

            // Create a Scanner object to take user input from the console
            Scanner sc = new Scanner(System.in);
            
            // Display a message to inform the user about the delete operation
            System.out.println("Delete Data from student table:");
            System.out.println("________________________________________");
            
            // Prompting the user to enter the student ID for the record to be deleted
            System.out.print("Enter student id: ");
            int sid = sc.nextInt();  // Reading the student ID as an integer

            // Constructing the SQL DELETE query to delete the student record based on the provided student ID
            // This query will delete the record where the column s_id matches the provided student ID
            String deleteQuery = "DELETE FROM student WHERE s_id=" + sid;

            // Executing the DELETE query using the executeUpdate() method of the Statement object
            // executeUpdate() is used for SQL commands that modify the database, like INSERT, UPDATE, DELETE
            s.executeUpdate(deleteQuery);

            // Displaying a success message after the data is deleted successfully from the database
            System.out.println("Data deleted successfully");

        } catch (SQLException err) {
            // Catching any SQLException that occurs during database operations
            // Printing the error message if any issue occurs during the database connection or query execution
            System.out.println("ERROR: " + err);
        }
    }
}
