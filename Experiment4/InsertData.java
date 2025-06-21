import java.sql.*; // Importing SQL package for database connectivity
import java.util.Scanner; // Importing Scanner for user input

/**
 * The InsertData class is a simple Java application that connects to a MySQL database
 * and inserts user-provided data into the `student` table.
 *
 * The program performs the following operations:
 * 1. Establishes a connection to the MySQL database (`mydb`).
 * 2. Prompts the user to enter the student ID, name, and address.
 * 3. Constructs a SQL INSERT query with the user input.
 * 4. Executes the SQL query to insert the data into the database.
 * 5. Prints a success message if the data is inserted successfully, or an error message if there is an exception.
 */
public class InsertData {

    /**
     * The main method is the entry point of the program.
     * It handles the entire process of connecting to the database,
     * gathering user input, and inserting that data into the database.
     *
     * @param args Command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        
        // Using try-with-resources to ensure that the connection and statement objects are closed automatically
        try (
            // Establishing a connection to the MySQL database named "mydb" on localhost
            // "root" is the username, and "ace123" is the password.
            //class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "sql@itself12");
            
            // Creating a Statement object to execute SQL queries against the database
            Statement s = con.createStatement()
        ) {
            
            // Creating a Scanner object to read input from the user
            Scanner sc = new Scanner(System.in);
            
            // Displaying a message to inform the user that the program is about to insert data into the database
            System.out.println("Inserting Data into student table:");
            System.out.println("________________________________________");
            
            // Prompting the user to enter a student ID
            System.out.print("Enter student id: ");
            int sid = sc.nextInt();  // Reading the student ID from user input

            // Prompting the user to enter a student name
            System.out.print("Enter student name: ");
            String sname = sc.next();  // Reading the student name from user input

            // Prompting the user to enter the student's address
            System.out.print("Enter student address: ");
            String saddr = sc.next();  // Reading the student address from user input

            // Constructing an SQL INSERT query using the user input to insert the data into the `student` table
            // The query assumes that the `student` table has the following columns: id, name, address
            String insertQuery = "INSERT INTO student VALUES(" + sid + ",'" + sname + "','" + saddr + "')";

            // Executing the SQL INSERT query using the executeUpdate() method, which is used for SQL commands
            // that modify the database (such as INSERT, UPDATE, DELETE)
            s.executeUpdate(insertQuery);

            // Printing a success message after successfully inserting the data into the database
            System.out.println("Data inserted successfully into student table");

        } catch (SQLException err) {
            // If an exception occurs during database connection or query execution, it is caught here
            // Printing the error message to the console
            System.out.println("ERROR: " + err);
        }
    }
}
