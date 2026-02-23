//2.3 Write statements to accomplish each of the following tasks: 
//a) Declare variables c, thisIsAVariable, q76354 and number to be of type int.
//b) Prompt the user to enter an integer. 
//c) Input an integer and assign the result to int variable value. Assume Scanner variable input can be used to read a value from the keyboard.
//d) Print "This is a Java program" on one line in the command window. Use method System.out.println. 
//e) Print "This is a Java program" on two lines in the command window. The first line should end with Java. Use method System.out.printf and two %s format specifiers. 
//f) If the variable number is not equal to 7, display "The variable number is not equal to 7”

import java.util.Scanner;

public class Exercise2_3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int c, thisIsAVariable, q76354, number;
		System.out.print("Enter an integer: ");
		int value = input.nextInt();
		System.out.println("This is a Java program");
		System.out.printf("This is a Java%n%s%n","program");
		if (value != 7) System.out.print("The variable number is not equal to 7");
		
	}
}
