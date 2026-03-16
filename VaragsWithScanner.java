import java.util.Scanner;

public class VaragsWithScanner{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		//Read the name
		System.out.print("Enter your name");
		String name = input.nextLine();
		
		//Ask how many scores the user wants to enter
		System.out.print("How many scores will you enter?");
		int n = input.nextInt();
		
		int[] scores =  new int[n];
		
		//Read scores
		for(int i = 0; i < n; i++){
			
			System.out.print("Enter score " + (i+1) + ": ");
			scores[i] = input.nextInt();
		
		}
		
		//call the method using varags (pass the array)
		greet(name, scores);
		
		input.close();
		
	}
	
	public static void greet(String name, int... scores){
		
		System.out.println("\nHello " + name +",your scores are: ");
		for(int s : scores){
			System.out.println(s);
		}
		
	}
	
	
}