package studentmanagement;

import java.util.Scanner;

import java.util.ArrayList;

public class StudentManagement {


static ArrayList<Student> students = new ArrayList<>();

static Scanner sc = new Scanner(System.in);

public static void main(String[] args) {

	StudentService service = new StudentService();



	int choice;

	do {

		System.out.println("\n====== Student Management System =====");
		System.out.println("1.Add New Student");
		System.out.println("2.View All Student");
		System.out.println("3.Search Student");
		System.out.println("4.Update Student");
		System.out.println("5.Delet Student");
		System.out.println("6.Exit");

		choice = InputTrace.readInt("Enter Your choice");



		switch(choice) {

		case 1:

			service.addStudent();

			break;

		case 2:

			service.viewStudent();

			break;

		case 3:

			service.searchStudent();

			break;

		case 4:

			service.updateStudent();

			break;

		case 5:

			service.deletStudent();

		    break;

		case 6:

			System.out.println("Exiting the system");

			break;

		default:

			System.out.println("Invalid choice ! Please try again.");


















		}

	} while(choice!=6);







}


}
