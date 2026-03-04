import java.util.Scanner;

public class sentinelloop{

	public static void main (String[] args){
	
		Scanner input = new Scanner(System.in);
		int sum = 0;
		
		while(true){
			
			System.out.print("Enter any number (-1 Ends the Loop): ");
			int num = input.nextInt();
			
			if(num == -1){
				break;
				
			}
			sum+= num;
			
		}
		System.out.printf("The sum of all the numbers is %d%n", sum);
	}

}