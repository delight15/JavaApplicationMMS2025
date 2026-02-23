//Write an application that reads five integers and determines and prints the largest and smallest integers in the group. 
//Use only the programming techniques you learned in this chapter.
import java.util.Scanner;

public class Exercise2_24{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int a = input.nextInt();
		System.out.print("Enter another integer: ");
		int b = input.nextInt();
		System.out.print("Enter another integer: ");
		int c = input.nextInt();
		System.out.print("Enter another integer: ");
		int d = input.nextInt();
		System.out.print("Enter another integer: ");
		int e = input.nextInt();
		
		int largest = a;
		if (b >= largest) largest = b;
		if (c >= largest) largest = c;
		if (d >= largest) largest = d;
		if (e >= largest) largest = e;
		
		int smallest = a;
		if (b <= smallest) smallest = b;
		if (c <= smallest) smallest = c;
		if (d <= smallest) smallest = d;
		if (e <= smallest) smallest = e;
		
		System.out.printf("Largest number is %d%n",largest);
		System.out.printf("Smallest number is %d%n",smallest);
		
		
	}
}
