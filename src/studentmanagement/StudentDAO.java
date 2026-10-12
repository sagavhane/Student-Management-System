
package studentmanagement;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDAO {

    public boolean addStudent(Student student) {
        String sql = "INSERT INTO students (roll_number, name, marks) VALUES (?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, student.getRollnumber());
            ps.setString(2, student.getName());
            ps.setDouble(3, student.getMarks());

            int rows = ps.executeUpdate();

            return rows > 0;

        } catch (SQLException e) {
            System.out.println("Error adding student: " + e.getMessage());
            return false;
        }
    }

public Student getStudentByRollNumber(int rollNo) {
    String sql = "SELECT * FROM students WHERE roll_number = ?";

    try (Connection con = DBConnection.getConnection();
         PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setInt(1, rollNo);

        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                int rollNumber = rs.getInt("roll_number");
                String name = rs.getString("name");
                double marks = rs.getDouble("marks");

                return new Student(rollNumber, name, marks);
            }
        }

    } catch (SQLException e) {
        System.out.println("Error searching student: " + e.getMessage());
    }

    return null;
}

public ArrayList<Student> getAllStudents() {
    ArrayList<Student> list = new ArrayList<>();

    String sql = "SELECT * FROM students";

    try (Connection con = DBConnection.getConnection();
         PreparedStatement ps = con.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {
            int rollNumber = rs.getInt("roll_number");
            String name = rs.getString("name");
            double marks = rs.getDouble("marks");

            Student student = new Student(rollNumber, name, marks);
            list.add(student);
        }

    } catch (SQLException e) {
        System.out.println("Error retrieving students: " + e.getMessage());
    }

    return list;
}

public boolean updateStudentName(int rollNo, String name) {
    String sql = "UPDATE students SET name = ? WHERE roll_number = ?";

    try (Connection con = DBConnection.getConnection();
         PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setString(1, name);
        ps.setInt(2, rollNo);

        return ps.executeUpdate() > 0;

    } catch (SQLException e) {
        System.out.println("Error updating student name: " + e.getMessage());
        return false;
    }
}

public boolean updateStudentMarks(int rollNo, double marks) {
    String sql = "UPDATE students SET marks = ? WHERE roll_number = ?";

    try (Connection con = DBConnection.getConnection();
         PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setDouble(1, marks);
        ps.setInt(2, rollNo);

        return ps.executeUpdate() > 0;

    } catch (SQLException e) {
        System.out.println("Error updating student marks: " + e.getMessage());
        return false;
    }
}

public boolean deleteStudent(int rollNo) {
    String sql = "DELETE FROM students WHERE roll_number = ?";

    try (Connection con = DBConnection.getConnection();
         PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setInt(1, rollNo);

        return ps.executeUpdate() > 0;

    } catch (SQLException e) {
        System.out.println("Error deleting student: " + e.getMessage());
        return false;
    }
}



}
