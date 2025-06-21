import java.sql.*;  // Importing the SQL package to handle database connectivity

/**
 * The DisplayData class connects to a MySQL database, retrieves all student records from the `student` table,
 * and displays the student ID, name, and address in a formatted output.
 *
 * The program:
 * 1. Connects to the MySQL database `mydb`.
 * 2. Executes a SELECT query to fetch all records from the `student` table.
 * 3. Iterates through the `ResultSet` and prints each student's ID, name, and address.
 * 4. Handles SQL exceptions if any issues occur during the database connection or query execution.
 */
public class DisplayData {

    /**
     * The main method is the entry point of the program.
     * It handles the connection to the database, executes a query, and displays the student data.
     * 
     * @param args Command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        try (
            // Establish a connection to the MySQL database named "mydb" on localhost
            // The connection is made using the "root" user and the password "ace123"
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "sql@itself12");
            
            // Create a Statement object to execute SQL queries
            Statement s = con.createStatement()
        ) {

            // Execute a SQL SELECT query to retrieve all records from the `student` table
            // The query will fetch the columns `s_id`, `s_name`, and `s_address` for all students in the table
            ResultSet rs = s.executeQuery("SELECT * FROM student");

            // Check if the ResultSet is not null (it should contain data if there are records in the table)
            if (rs != null) {
                // Print the column headers for the student data
                System.out.println("SID \t STU_NAME \t ADDRESS");
                System.out.println("________________________________________");

                // Iterate through each row in the ResultSet
                // For each row, we retrieve and print the student ID, name, and address
                while (rs.next()) {
                    // Access each column in the current row by column name (e.g., "s_id", "s_name", "s_address")
                    // and print them in a formatted way
                    System.out.println(rs.getString("s_id") + " \t " + rs.getString("s_name") + " \t " + rs.getString("s_address"));
                    // Print a line separator for better readability between rows
                    System.out.println("________________________________________");
                }
            }

        } catch (SQLException err) {
            // Catching any SQLException that occurs during database operations
            // Printing the error message if any issue occurs during the database connection or query execution
            System.out.println("ERROR: " + err);
        }
    }
}
