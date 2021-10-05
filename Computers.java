package LabPackage;

public class Computers {
	
// 3. Create a Computer class that has 3 variables. The first variable will have a name.
// The second variable will be the year of the computer. Last variable will be the cost of the computer.
// All 3 variables should be private instance variables and must use getters to retrieve the data and setters to set the variables.
				

	
	private String cName;
	private int cYear;
	private double cCost;
	
	
//	public Computers() {
//		
//	}
//	
//	public Computers(String name, int year, double cost ) {
//		this.cName = name;
//		this.cYear = year;
//		this.cCost = cost;
//	}
	 // Setter
	   public void setComputer(String newName, int newYear, double newCost) {
	     this.cName = newName;
	     this.cYear = newYear;
		 this.cCost = newCost;
	   }
	
	
	 // Getter
	   public String getComputer() {
	     return "Computer Name: " + cName + " /" + " Computer Year: " + cYear + " /" + " Computer Cost: " + "$"+cCost;
	   }
	   
	   

	  
	
	public static void main(String[] args) {
		
		// Calling Constructor
		Computers c1 = new Computers();
		
		c1.setComputer("Macbook Pro", 2019, 2000);
		
		System.out.println(c1.getComputer());
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		End of Main
	}

}
