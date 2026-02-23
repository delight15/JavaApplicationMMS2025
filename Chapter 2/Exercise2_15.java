//Write an application that asks the user to enter two integers, obtains them from the user and prints their sum, product, difference and quotient (division)


import java.util.Scanner;

public class Exercise2_15{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int x = input.nextInt();
		System.out.print("Enter another number: ");
		int y = input.nextInt();
		
		System.out.println("-----");
		System.out.printf("The sum of %d and %d is %d%n",x,y,(x+y));
		
		System.out.printf("The product of %d and %d is %d%n",x,y,(x*y));
		
		System.out.printf("The difference between %d and %d is %d%n",x,y,(x-y));
		
		System.out.printf("The quotient of %d and %d is %d%n",x,y,(x/y));
		
		
	
	
	}


}
