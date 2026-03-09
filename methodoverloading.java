import java.util.Scanner;

public class methodoverloading{
	
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("1. Calculate the area of a square");
		System.out.println("2. Calculate area of a rectangle");
		System.out.println("3. Calculate the area of a traingle");
		
		System.out.print("Enter your choice ");
		int choice = input.nextInt();
		
		
		switch(choice){
			
			case 1:
				System.out.print("Enter the length of the square ");
				int squarelength =  input.nextInt();
				
				//methodoverloading.area(squarelength
				
				
			break;
			
			case 2:
				System.out.print("Enter the length of the rectangle ");
				int rectanglelength = input.nextInt();
				
				System.out.print("Enter the breadth of the rectangle ");
				int breadthlength = input.nextInt();
				
				methodoverloading.area(rectanglelength, breadthlength);
			break;
			
			case 3:
				System.out.print("Enter the length of the triangle ");
				int trianglelength = input.nextInt();

				System.out.print("Enter the base of the rectangle ");
				double base = input.nextInt();
				
				methodoverloading.area(trianglelength, base);
			break;
			
			default:
				System.out.print("invalid input");
		}


		
	}
	public static void area (int length){
		
		int areaofsquare = length * length;
		System.out.printf("The area of the square is %d", areaofsquare);
	
		
	}
	
	public static void area (int length, int breadth){
		int areaofrectangle = length * breadth;
		System.out.printf("The area of the rectangle is %d",areaofrectangle);
		
	}
	public static void area (int length, double base){
		double areaoftriangle = length * base * 0.5;
		System.out.printf("The area of the trinagle is %f", areaoftriangle);
		
	}
	
}