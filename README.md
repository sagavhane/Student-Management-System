# Student Management System

A console-based Student Management System developed using Java, JDBC, and MySQL. The application allows users to manage student records through database operations.

## Features

- Add a student
- View all students
- Search for a student by roll number
- Update student name
- Update student marks
- Delete a student
- Store student records in a MySQL database

## Technologies Used

- Java
- JDBC
- MySQL
- Git and GitHub
- Eclipse IDE

## Database Structure

**Database:** `student_db`

**Table:** `students`

| Column | Data Type | Description |
|---|---|---|
| `roll_number` | INT | Primary key |
| `name` | VARCHAR(100) | Student name |
| `marks` | DOUBLE | Student marks |

The database schema is available in `database/schema.sql`.

## Setup and Execution

1. Install Java and MySQL.
2. Clone or download this repository.
3. Open MySQL Workbench and execute `database/schema.sql`.
4. Configure the MySQL connection details in `DBConnection.java`.
5. Ensure the MySQL JDBC driver is available in the project.
6. Run `StudentManagement.java` to start the application.

## Learning Outcomes

- Practiced object-oriented programming in Java.
- Implemented CRUD operations using JDBC.
- Connected a Java application to a MySQL database.
- Practiced organizing application logic and database access.

## Author

Sangram Gavhane

GitHub: https://github.com/sagavhane