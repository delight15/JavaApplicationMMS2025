//Write an application that inputs one number consisting of five digits from the user, 
//separates the number into its individual digits and prints the digits separated from one another by three spaces each. 
//For example, if the user types in the number 42339, the program should print 4 2 3 3 9

import java.util.Scanner;

public class Exercise2_30{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 5 digits number: ");
		int num = input.nextInt();
		
		int a = num / 10000;
		int b = (num / 1000) % 10;
		int c = (num / 100) % 10;
		int d = (num / 10) % 10;
		int e = num % 10;
		
		System.out.printf("%d %d %d %d %d",a,b,c,d,e);
		
	}
}
