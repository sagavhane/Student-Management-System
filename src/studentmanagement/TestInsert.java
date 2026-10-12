
package studentmanagement;

public class TestInsert {

    public static void main(String[] args) {

        Student student = new Student(101, "Rahul", 85.5);

        StudentDAO dao = new StudentDAO();

        boolean result = dao.addStudent(student);

        if (result) {
            System.out.println("Student inserted successfully!");
        } else {
            System.out.println("Student insertion failed!");
        }
    }
}
