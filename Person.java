package LabPackage;
public class Person {
	// ===== WHAT IS A CLASS? =====
	// • Template/blueprint to create an object
	
	// ===== HOW DO WE DEFINE OBJECT? =====
	// • Characteristics of object: every object has a state/properties and methods
	// • State is a characteristic of an object
	// • Method is a variable of an object
	
	// ===== HOW DO WE DEFINE A METHOD? =====
	// • Consist of business logic which consists of one purpose/task (has a behavior) 
	
	// ===== SIDE NOTES =====
	// Not every class needs to be instantiated.
	// Not all classes will have methods and variables.
	// Static methods could be called without object reference (non-static is the opposite)
	
	// Instance variables: these are not similar to your local variables
	// It's not best practice to put default values. 
	
	// ===== STATIC VARIABLES =====
		// Created at the class level
		// Variables that have a default value and affect all
		// Note: we use the static identifier, final you can't change the value of (similar to const)
//  EX: static void String name;
	
	// ===== INSTANCE VARIABLES =====
		// These are not similar to your local variables
		// It's not best practice to put default values.
		// Properties that belong to eachPerson but the value are different to each Person.
//	EX:	String name;
 
		
		
//	String pname;
	String fname;
	String lname;
	int page;
	char pgender;
	String paddress;
	
	// Creating empty constructor - this is constructing an object.
	// Compiler can create an empty constructor for us if we don't create it.
	// This is called Constructor overloading. To test this out comment out the public Person() and the public Person(parameters...)
	public Person() {
		
	}
	
	// Creating parametized constructor
	public Person(String firstName, String lastName, int age, char gender, String address) {
//		pname = name;
		this.fname = firstName;
		this.lname = lastName;
		this.page = age;
		this.pgender = gender;
		this.paddress = address;
		
	}
	// Instance method or non-static method
	void display() {
//		System.out.println("Name: " + this.pname);
		System.out.println("First Name: " + this.fname);
		System.out.println("Last Name: " + this.lname);
		System.out.println("Gender: " + this.pgender);
		System.out.println("Age: " + this.page);
		System.out.println("Address: " + this.paddress);

	}
	// static or class method
	static void info() {
		System.out.println("Information about person class...");
		System.out.println("----------------");
	}
	
	public static void main(String[] args) {
		info();
		
		// Calling constructor
		Person p1 = new Person();
		
//		p1.pname = "John";
		p1.fname = "Sinuhe";
		p1.lname = "Montero";
		p1.page = 15;
		p1.pgender = 'M';  // not the single quotes
		p1.paddress = "Dyckman  Street";
		if(p1.page >= 18) {
			System.out.println("You are eligible to vote!");
		}else System.out.println("You are NOT eligible to vote!");
		
		p1.display();
		System.out.println("----------------");
		System.out.println("Person 2----------------");
		System.out.println("----------------");
		Person p2 = new Person();
		

		p2.fname = "Tiffany";
		 p2.lname = "E.";
		p2.page = 22;
		p2.pgender = 'F';  // not the single quotes
		p2.paddress = "207  Street";
		if(p2.page >= 18) {
			System.out.println("You are eligible to vote!");
		}else System.out.println("You are NOT eligible to vote!");
		p2.display();
		
	 
		
		// You can create as many objects as you want. We are creating instantiations of Person Class. Each person will have different values.
		System.out.println("----------------");
		System.out.println("Person 3----------------");
		System.out.println("----------------");
		Person p3 = new Person("Sinuhe", "Montero", 33, 'M', "New York");
		if(p3.page >= 18) {
			System.out.println("You are eligible to vote!");
		}else System.out.println("You are NOT eligible to vote!");
		if(p3.fname.charAt(0) == 'A' || p3.fname.charAt(0) == 'E' || p3.fname.charAt(0) == 'I' || p3.fname.charAt(0) == 'U') {
			System.out.println("Your name begins with a Vowel!");
		}else System.out.println("Your name does NOT begin with a Vowel!");
		p3.display();
		
		
		System.out.println("----------------");
		System.out.println("Person 4----------------");
		System.out.println("----------------");
		Person p4 = new Person("Elon", "Musk", 15, 'M', "California");
		if(p4.page >= 18) {
			System.out.println("You are eligible to vote!");
		}else System.out.println("You are NOT eligible to vote!");
		
		if(p4.fname.charAt(0) == 'A' || p4.fname.charAt(0) == 'E' || p4.fname.charAt(0) == 'I' || p4.fname.charAt(0) == 'U') {
			System.out.println("Your name begins with a Vowel!");
		}else System.out.println("Your name does NOT begin with a Vowel!");
		p4.display();
		
		
		
	}

}