//Write a program that inputs five numbers and determines and prints:
//the number of negative numbers input, the number of positive numbers input and the number of zeros input. 

import java.util.Scanner;

public class Exercise2_32{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int pos = 0, neg = 0, zero = 0;
		
		System.out.print("Enter an integer(positive or negative or zero): ");
		int a = input.nextInt();
		if (a > 0) pos++;
		else if (a < 0) neg++;
		else zero++;
		
		System.out.print("Enter an integer(positive or negative or zero): ");
		int b = input.nextInt();
		if (b > 0) pos++;
		else if (b < 0) neg++;
		else zero++;
		
		System.out.print("Enter an integer(positive or negative or zero): ");
		int c = input.nextInt();
		if (c > 0) pos++;
		else if (c < 0) neg++;
		else zero++;
		
		System.out.print("Enter an integer(positive or negative or zero): ");
		int d = input.nextInt();
		if (d > 0) pos++;
		else if (d < 0) neg++;
		else zero++;
		
		System.out.print("Enter an integer(positive or negative or zero): ");
		int e = input.nextInt();
		if (e > 0) pos++;
		else if (e < 0) neg++;
		else zero++;
		
		System.out.printf("Positive = %d%nNegative = %d%nZero = %d%n",pos,neg,zero);
			
		
	}
}
