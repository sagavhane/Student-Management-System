package studentmanagement;

import java.util.ArrayList;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();
    private StudentDAO dao = new StudentDAO();

    public void addStudent() {

        int rollNum = InputTrace.readInt("Enter the roll number: ");

        if (findStudent(rollNum) != null) {
            System.out.println("Roll Number Already Exists");
            return;
        }

        String name = InputTrace.readString("Enter the name: ");

        if (name.isEmpty()) {
            System.out.println("Name cannot be empty.");
            return;
        }

        double marks = InputTrace.readDouble("Enter the marks: ");

        if (marks < 0 || marks > 100) {
            System.out.println("Marks must be between 0 and 100.");
            return;
        }


       Student s1 = new Student(rollNum, name, marks);

           boolean result = dao.addStudent(s1);

        if (result) {
              System.out.println("Student added successfully.");
                       } 
         else {
              System.out.println("Student could not be added.");
             }

          }


public void viewStudent() {
    ArrayList<Student> students = dao.getAllStudents();

    if (students.isEmpty()) {
        System.out.println("No students found.");
        return;
    }

    for (int i = 0; i < students.size(); i++) {
        students.get(i).displaystudent();
    }
}


    public void searchStudent() {

        int rollNo = InputTrace.readInt(
                "Enter the roll number to search: ");

        Student s = findStudent(rollNo);

        if (s != null) {
            s.displaystudent();
        } else {
            System.out.println("Student not found.");
        }
    }


public void updateStudent() {
    int rollNo = InputTrace.readInt("Enter the roll number to update: ");

    Student s = findStudent(rollNo);

    if (s == null) {
        System.out.println("Student not found.");
        return;
    }

    System.out.println("1. Update Name");
    System.out.println("2. Update Marks");

    int choice = InputTrace.readInt("Enter your choice: ");

    switch (choice) {
        case 1:
            String name = InputTrace.readString("Enter new name: ");

            boolean nameUpdated = dao.updateStudentName(rollNo, name);

            if (nameUpdated) {
                System.out.println("Name updated successfully.");
            } else {
                System.out.println("Name could not be updated.");
            }
            break;

        case 2:
            double marks = InputTrace.readDouble(
                    "Enter new marks (0-100): ");

            if (marks < 0 || marks > 100) {
                System.out.println("Marks must be between 0 and 100.");
                return;
            }

            boolean marksUpdated = dao.updateStudentMarks(rollNo, marks);

            if (marksUpdated) {
                System.out.println("Marks updated successfully.");
            } else {
                System.out.println("Marks could not be updated.");
            }
            break;

        default:
            System.out.println("Invalid choice.");
    }
}


         public void deletStudent() {
            int rollNo = InputTrace.readInt("Enter roll number to delete: ");

            Student s = findStudent(rollNo);

              if (s == null) {
                System.out.println("Student not found.");
                  return;
                  }

              boolean result = dao.deleteStudent(rollNo);

              if (result) {
                    System.out.println("Student removed successfully.");
                   } 
              
              else {
                    System.out.println("Student could not be removed.");
                  }
}



private Student findStudent(int rollNo) {
    return dao.getStudentByRollNumber(rollNo);
}

}
