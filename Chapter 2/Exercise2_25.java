//Write an application that reads an integer and determines and prints whether it’s odd or even. 
//[Hint: Use the remainder operator. An even number is a multiple of 2. Any multiple of 2 leaves a remainder of 0 when divided by 2.]
import java.util.Scanner;

public class Exercise2_25{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num = input.nextInt();
		
		if (num != 0 && num % 2 == 0) 
			System.out.printf("%d is an even number%n",num);
		else
			System.out.printf("%d is an odd number%n",num);
		
		
	}
}
