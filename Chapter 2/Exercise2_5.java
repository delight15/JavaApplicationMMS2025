//2.5 Write declarations, statements or comments that accomplish each of the following tasks: 
//a) State that a program will calculate the product of three integers. 
//b) Create a Scanner called input that reads values from the standard input. 
//c) Declare the variables x, y, z and result to be of type int. 
//d) Prompt the user to enter the first integer. 
//e) Read the first integer from the user and store it in the variable x. 
//f) Prompt the user to enter the second integer. 
//g) Read the second integer from the user and store it in the variable y.
//h) Prompt the user to enter the third integer. 
//i) Read the third integer from the user and store it in the variable z.
//j) Compute the product of the three integers contained in variables x, y and z, and assign the result to the variable result. 
//k) Use System.out.printf to display the message "Product is" followed by the value of the variable result.

import java.util.Scanner;

public class Exercise2_5{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter any number (num1): ");
		int x = input.nextInt();
		
		System.out.printf("num1 = %d%n",x);
		
		System.out.print("Enter another number (num2): ");
		int y = input.nextInt();
		
		System.out.printf("num2 = %d%n",y);
		
		System.out.print("Enter another number (num3): ");
		int z = input.nextInt();
		
		System.out.printf("num3 = %d%n",z);
		
		int result = x * y * z;
		
		System.out.println("--");
		System.out.printf("The product of %d and %d and %d (%d x %d x %d) is %d%n",x,y,z,x,y,z,result); 
	}
}