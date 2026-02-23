//Write an application that reads two integers, determines whether the first is a multiple of the second and prints the result. 
//[Hint: Use the remainder operator.]
import java.util.Scanner;

public class Exercise2_26{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int x = input.nextInt();
		
		System.out.print("Enter another integer: ");
		int y = input.nextInt();
		
		if (y != 0 && x % y == 0)
			System.out.printf("%d is a multiple of %d%n",x,y);
		else
			System.out.printf("%d is not a multiple of %d%n",x,y);
		
		
		
	}
}
