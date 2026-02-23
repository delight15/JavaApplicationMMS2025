//Write an application that inputs three integers from the user and 
//displays the sum, average, product, smallest and largest of the numbers. 
//[Note: The calculation of the average in this exercise should result in an integer representation of the average. 
//So, if the sum of the values is 7, the average should be 2, not 2.3333….]

import java.util.Scanner;

public class Exercise2_17{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int x = input.nextInt();
		System.out.print("Enter another number: ");
		int y = input.nextInt();
		System.out.print("Enter another number: ");
		int z = input.nextInt();
		int average = (x + y + z)/3;
		
		System.out.println("---");
		
		System.out.printf("Sum -- %d + %d + %d = %d%n",x,y,z,(x+y+z)); 
		System.out.printf("Product -- %d * %d * %d = %d%n",x,y,z,(x*y*z));
		System.out.printf("Average -- (%d + %d + %d)/3 = %d%n",x,y,z,average);
		
		if (x >= y && x >= z)
			System.out.printf("The largest number is %d%n",x);
		else if (y >= x && y >= z)
			System.out.printf("The largest number is %d%n",y);
		else 
			System.out.printf("The largest number is %d%n",z);
		
		if (x <= y && x <= z)
			System.out.printf("The smallest number is %d%n",x);
		else if (y <= x && y <= z)
			System.out.printf("The smallest number is %d%n",y);
		else 
			System.out.printf("The smallest number is %d%n",z);
		
		
		
	}
}	