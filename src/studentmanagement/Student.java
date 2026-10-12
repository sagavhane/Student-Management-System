package studentmanagement;

public class Student {
	
	private int rollnumber;
	private String name;
	private double marks;
	
	
	public Student(int rollnumber, String name, double marks) {
		this.rollnumber = rollnumber;
		this.name = name;
		this.marks =marks;
		
		
	}


	public int getRollnumber() {
		return rollnumber;
	}


	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getMarks() {
		return marks;
	}


	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	public void displaystudent() {
		System.out.println("Roll number of the student is  :"+rollnumber);
		System.out.println("Name of the student is :"+name);
		System.out.println("Marks of the students are :"+marks);
		
		
	}

}
