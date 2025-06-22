# Experiment 4: Java MySQL Student Database Operations

This experiment demonstrates how to perform basic CRUD (Create, Read, Update, Delete) operations on a MySQL database using Java. The operations are performed on a `student` table in a database named `mydb`. The project uses JDBC (Java Database Connectivity) for database interaction.

---

## Folder Structure

```
Experiment4/
│
├── InsertData.java         # Java program to insert student data
├── DisplayData.java        # Java program to display all student data
├── UpdateData.java         # Java program to update student data
├── DeleteData.java         # Java program to delete student data
├── InsertData.class        # Compiled class file for InsertData
├── InsertData.readme       # Documentation for InsertData.java
├── lib/
│   └── mysql-connector-j-9.2.0.jar  # MySQL JDBC driver
└── .vscode/
    └── launch.json         # VS Code launch configuration
```

---

## Requirements

- **Java JDK** (version 8 or above)
- **MySQL Server** running locally
- **MySQL Connector/J** (already included in `lib/`)
- **VS Code** (optional, for easier running/debugging)

---

## Database Setup

1. **Start MySQL Server** on your machine.
2. **Create the database and table** using the following SQL commands:

```sql
CREATE DATABASE mydb;
USE mydb;
CREATE TABLE student (
    s_id INT PRIMARY KEY,
    s_name VARCHAR(100),
    s_address VARCHAR(255)
);
```

---

## How to Compile and Run

1. **Open a terminal** in the `Experiment4` directory.
2. **Compile the Java files** (make sure to include the MySQL connector in the classpath):

   ```sh
   javac -cp .;lib/mysql-connector-j-9.2.0.jar InsertData.java DisplayData.java UpdateData.java DeleteData.java
   ```

3. **Run any program** (example for InsertData):

   ```sh
   java -cp .;lib/mysql-connector-j-9.2.0.jar InsertData
   ```

   *(Use `:` instead of `;` as the separator on Linux/Mac.)*

---

## Program Descriptions

### 1. InsertData.java

- **Purpose:** Insert a new student record into the `student` table.
- **How it works:** Prompts for student ID, name, and address, then inserts them into the database.
- **Sample Output:**
  ```
  Inserting Data into student table:
  ________________________________________
  Enter student id: 101
  Enter student name: John
  Enter student address: Hyderabad
  Data inserted successfully into student table
  ```

### 2. DisplayData.java

- **Purpose:** Display all student records from the `student` table.
- **How it works:** Fetches all records and prints each student's ID, name, and address.
- **Sample Output:**
  ```
  SID      STU_NAME      ADDRESS
  ________________________________________
  101      John          Hyderabad
  102      Alice         Mumbai
  ________________________________________
  ```

### 3. UpdateData.java

- **Purpose:** Update the name and address of a student based on their ID.
- **How it works:** Prompts for student ID, new name, and new address, then updates the record.
- **Sample Output:**
  ```
  Update Data in student table:
  ________________________________________
  Enter student id: 101
  Enter student name: JohnUpdated
  Enter student address: Delhi
  Data updated successfully
  ```

### 4. DeleteData.java

- **Purpose:** Delete a student record based on their ID.
- **How it works:** Prompts for student ID, then deletes the corresponding record.
- **Sample Output:**
  ```
  Delete Data from student table:
  ________________________________________
  Enter student id: 101
  Data deleted successfully
  ```

---

## Notes

- **Database Credentials:**  
  The programs use the following credentials by default:
  - Username: `root`
  - Password: `sql@itself12`
  - Database: `mydb`
  - Change these in the Java files if your MySQL setup is different.

- **JDBC Driver:**  
  The MySQL Connector/J JAR file must be present in the `lib/` directory and included in the classpath when compiling and running.

- **Error Handling:**  
  If there are issues connecting to the database or executing queries, error messages will be printed to the console.

---

## Troubleshooting

- **Cannot connect to database:**  
  - Ensure MySQL server is running.
  - Check that the database and table exist.
  - Verify username and password in the Java files.

- **JDBC driver not found:**  
  - Make sure `mysql-connector-j-9.2.0.jar` is in the `lib/` folder.
  - Use the correct classpath syntax for your OS.

- **Table or column not found:**  
  - Ensure the table schema matches the column names used in the Java code (`s_id`, `s_name`, `s_address`).

---

## References

- [MySQL Connector/J Documentation](https://dev.mysql.com/doc/connector-j/9.2/en/)
- [JDBC Tutorial](https://docs.oracle.com/javase/tutorial/jdbc/)

---

*This experiment demonstrates practical database operations in Java and is suitable for students learning JDBC and SQL basics.*
![WhatsApp Image 2025-06-11 at 08 32 52_6fc82732](https://github.com/user-attachments/assets/9387fbbc-85e8-4964-a25d-f7c95cb70aef)
![WhatsApp Image 2025-06-11 at 08 32 52_5f5a664f](https://github.com/user-attachments/assets/6ff074b8-fb06-46e9-93f0-a7b8bffcc8e7)
![WhatsApp Image 2025-06-11 at 08 32 52_63949473](https://github.com/user-attachments/assets/db882ac5-2d3c-4548-b2d4-882b385e9f0d)
![WhatsApp Image 2025-06-11 at 08 32 53_585ae9b2](https://github.com/user-attachments/assets/deb9f027-81cc-4b53-8cc5-a625ef62faec)
