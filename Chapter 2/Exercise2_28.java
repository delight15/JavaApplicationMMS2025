//Write an application that inputs from the user the radius of a circle as an integer and prints the circle’s diameter, 
//Circumference and area using the floating-point value 3.14159 for π. 
//[Note: You may also use the predefined constant Math.PI for the value of π. This constant is more precise than the value 3.14159. 
//Class Math is defined in package java.lang. 
//Classes in that package are imported automatically, so you do not need to import class Math to use it.] 
//Use the following formulas (r is the radius): diameter = 2r circumference = 2πr area = πr2 Do not store the results of each calculation in a variable. 
//Rather, specify each calculation as the value that will be output in a System.out.printf statement. 
//The values produced by the circumference and area calculations are floating-point numbers. 
//Such values can be output with the format specifier %f in a System.out.printf statement. 

import java.util.Scanner;

public class Exercise2_28{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter radius: ");
		int r = input.nextInt();
		
		System.out.printf("Diameter is %d%n",2 * r);
		System.out.printf("Circumference is %f%n",2 * Math.PI * r);
		System.out.printf("Area is %f%n",Math.PI * r * r);
		
	}
}
