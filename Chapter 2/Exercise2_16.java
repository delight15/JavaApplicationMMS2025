//Write an application that asks the user to enter two integers,
//obtains them from the user and displays the larger number
//followed by the words "is larger". If the numbers are equal, print the message "These numbers are equal".


import java.util.Scanner;

public class Exercise2_16{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int x = input.nextInt();
		System.out.print("Enter another number: ");
		int y = input.nextInt();
		
		System.out.println("-----");
		if(x > y)
		System.out.printf("%d is greater than %d",x,y);
		else if(x==y) System.out.printf("These numbers are equal");
		else
		System.out.printf("%d is greater than %d",y,x);
		
		
	
		
		
		
		
	
	
	
	}


}