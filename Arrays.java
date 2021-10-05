package LabPackage;

public class Arrays {

	public static void main(String[] args) {
//		Arrays practice:
		
//	1) Display the average of a given integer array 
		
		int[] NumbersArray = {10, 20, 30, 40};
		int length = NumbersArray.length;
		int sum =0;
		for(int i=0; i<NumbersArray.length; i++) {
			 
				 sum += NumbersArray[i];
				
						
			}
		 double average = sum/length;
		 System.out.println("Average of array: " + average);
		 
//	2) Display the number of times a user entered string is found in the given string array. 
		 
		 System.out.println("-------------------------"); 
		 
		 String strings[] = {"A","B","C","A"};
		    String search = "B";
		    int count = 0;
		    for (int s = 0; s< strings.length ;s++ ) 
		    {
		        
		            if(strings[s].equals(search))
		            {
		                count++;
		            }
		                           
		    }
		    System.out.println("Number of times a user entered string is found in the given string array = " + count); 
//
//	3) Copy one array into another (without any built-in method) and display the new array
//		
		 System.out.println("-------------------------"); 
		    int arr[] = { 1, 8, 3 };
		    
	        // Create an array b[] of same size as a[]
	        int b[] = new int[arr.length];
	 
	        // Doesn't copy elements of a[] to b[],
	        // only makes b refer to same location
	        b = arr;
	 
	        // Change to b[] will also reflect in a[]
	        // as 'a' and 'b' refer to same location.
	        b[0]++;
	 
	        System.out.println("Contents of a[] ");
	        for (int i = 0; i < arr.length; i++)
	            System.out.print(arr[i] + " ");
	 
	        System.out.println("\n\nContents of b[] ");
	        for (int i = 0; i < b.length; i++)
	            System.out.print(b[i] + " ");
		

	}

}
