package LabPackage;
import java.util.Scanner; 


public class MultipleInput {

	public static void main(String[] args) {
		
		System.out.println("Enter a number any number for it's 1 - 15 product: ");
		
		Scanner scan = new Scanner(System.in); 
		int value = scan.nextInt();
		

		for (int i = 1; i < 16; i++)
		{
			int newValue = value*i;
			System.out.println(newValue);
		}
		// close scanner when done   
		scan.close();                
	}

}

