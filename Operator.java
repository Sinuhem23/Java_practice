package LabPackage;

 

public class Operator {

	public static void main(String[] args) {
		
		

			 

			    // 1. Add, subtract, multiply, and divide (quotient & remainder) two numbers and
			    // display the output
			    // //////////////////////////////////////////////////////////////
			    int num1 = 2;
			    int num2 = 3;

			    float num1fl = num1;
			    float num2fl = num2;
			  

			    int addSum = num1 + num2;
			    int subSum = num1 - num2;
			    int mulSum = num1 * num2;
			 
			    float divSum = num1fl / num2fl;

			    System.out.println(num1 + " + " + num2 + " = " + addSum);
			    System.out.println(num1 + " - " + num2 + " = " + subSum);
			    System.out.println(num1 + " * " + num2 + " = " + mulSum);
			    System.out.println(num1 + " / " + num2 + " = " + divSum);

			    // 2. Swap two numbers: Store two numbers in separate variables, display their
			    // initial values, swap them, and display them again.
			    // //////////////////////////////////////////////////////////////

			    float first = 3.10f;
			    float second = 6.50f;

			    System.out.println("Before swap ");
			    System.out.println("First number = " + first);
			    System.out.println("Second number = " + second);

			    // Value of first is assigned to temporary
			    float temporary = first;

			    // Value of second is assigned to first
			    first = second;

			    // Value of temporary (which contains the initial value of first) is assigned to
			    // second
			    second = temporary;

			    System.out.println("After swap ");
			    System.out.println("First number = " + first);
			    System.out.println("Second number = " + second);

			    // 3. Display the average of five numbers: Create five separate variables
			    // holding different numbers and find the average
			    // //////////////////////////////////////////////////////////////

			    int avgNum1 = 2;
			    int avgNum2 = 5;
			    int avgNum3 = 8;
			    int avgNum4 = 7;
			    int avgNum5 = 6;
			    // int divAvg = 5;

			    float average = ((avgNum1 + avgNum2 + avgNum3 + avgNum4 + avgNum5) / 5f);

			    System.out.println("The average of " + avgNum1 + ", " + avgNum2 + ", " + avgNum3 + ", " + avgNum4 + ", " + avgNum5
			        + " is " + average);

			    // 4. Write a Java program that display the larger of two integers. Store these
			    // numbers in variables.
			    // //////////////////////////////////////////////////////////////

			    int one = 10;
			    int two = 20;

			    if (one > two) {
			      System.out.println(one + " is the largest ");
			    } else {
			      System.out.println(two + " is the largest ");
			    }

			    // 5. Display the largest of three numbers.
			    // //////////////////////////////////////////////////////////////

			    if (avgNum1 > avgNum2 && avgNum1 > avgNum3) {
			      System.out.println(avgNum1 + " is the largest ");
			    } else if (avgNum2 > avgNum1 && avgNum2 > avgNum3) {
			      System.out.println(avgNum2 + " is the largest ");
			    } else {
			      System.out.println(avgNum3 + " is the largest ");

			    }

			    // 6. Determine if a number is negative, positive, or zero.
			    // //////////////////////////////////////////////////////////////

			    if (num2 > 0) {
			      System.out.println(num2 + " is positive ");
			    } else if (num2 < 0) {
			      System.out.println(num2 + " is negative ");

			    } else {
			      System.out.println(num2 + " is zero ");

			    }

			    // 7. Determine if a number is even or odd.
			    // //////////////////////////////////////////////////////////////

			    if (num2 % 2 == 0) {
			      System.out.println(num2 + " is even ");

			    } else {
			      System.out.println(num2 + " is odd ");

			    }

			    // 8. Store a value in a variable called age. Determine if a person with the
			    // given age is eligible to vote (18 years old)
			    // //////////////////////////////////////////////////////////////
			    
			    int age = 21;
			    if (age >= 18) {
			      System.out.println("You can VOTE!");

			    } else {
			      System.out.println("Sorry. In a few more years you can vote!");

			    }

			  }

			

		


	
	

}