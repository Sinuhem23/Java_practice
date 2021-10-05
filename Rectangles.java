package LabPackage;

public class Rectangles {
	// 2. Create two Rectangle objects with a method Area which returns the area of each.
	// Length and width of two rectangles should be passed as parameters to the constructor (6,8) and (9,11).

			
			double length;
			double width;
			double area;
			
			
		public Rectangles() {
			
		}
		
		public Rectangles(double L, double W) {
			this.length = L;
			this.width = W;
		}
		
		void display() {
			System.out.println("Length: " + length + " Width: " + width);
			System.out.println("The area is: " + this.area);
		}
		
	public static void main(String[] args) {
		
		// Calling constructor
		// Rectangle 1
		System.out.println("Rectangle 1");
		Rectangles r1 = new Rectangles();
		r1.length = 6;
		r1.width = 8;
		r1.area = r1.length * r1.width;
		
		r1.display();
		
		
		System.out.println("--------------------");
		System.out.println("Rectangle 2");
		// Calling constructor
		// Rectangle 2
		Rectangles r2 = new Rectangles();
		r2.length = 9;
		r2.width = 11;
		r2.area = r2.length * r2.width;
		
		r2.display();

		
		
		
		
		
		
		
		
		
		
		
		
//		End of Main
	}

}
