package LabPackage;

public class Students {
	// Student ID  First Name Last Name  Student Email  Subject 1 Subject 2 Subject 3

	// 0001           Todd     Hopkins   Thop@gmail.org    90.5      80.0      70.0

	// 0002           Mario    Wells     Wario@gmail.org   80.3      80.5      100.0
	
	// Create a class named Student that can hold the data for a single student from the following table. 
	// Write a parameterized constructor to get the values in instance variables while creating student objects. 
	// Write a method to display all the fields of each student and then write another method (getAverage) that returns the average of three subjects.

		int studentID;
		String fname;
		String lname;
		String studentEmail;
		double subject1;
		double subject2;
		double subject3;
		double average;
	
	
	public Students() {
		
	}
	
	public Students(int ID, String firstName, String lastName, double sub1, double sub2, double sub3) {
		this.studentID = ID;
		this.fname = firstName;
		this.lname = lastName;
		this.subject1 = sub1;
		this.subject2 = sub2;
		this.subject3 = sub3;
	}
	
	void display() {
		System.out.print(" Student-ID  First Name  Last Name  Student Email  Subject 1  Subject 2   Subject 3    Average  ");
		System.out.println("        ");
		System.out.print("      " + studentID + "       " + fname  + "      " + lname + "   " + studentEmail + "      " + subject1 + "   " + subject2 + "       " + subject3 + "        " + average );

		System.out.println(" ");
	}
	
	
	public static void main(String[] args) {
	// Calling constructor
		Students s1 = new Students();
		
		s1.studentID = 0001;
		s1.fname = "Sinuhe";
		s1.lname = "Montero";
		s1.studentEmail = "sm@gmail.com";
		s1.subject1 = 139;
		s1.subject2 = 200;
		s1.subject3 = 194;
		s1.average = (s1.subject1 + s1.subject2 + s1.subject3)/3;
		
		s1.display();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		End of Main
	}

}
