//Display the integer equivalents of the following: ABCabc012$*+/ and the blank character.

import java.util.Scanner;

public class Exercise2_29{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an alphabet(uppercase or smallcase) OR a symbol: ");
		char character = input.next().charAt(0);
		
		System.out.printf("%c = %d",character,(int) character);
	}
}
// A code that allows user to input a symbol or an alphabet to see the unicode