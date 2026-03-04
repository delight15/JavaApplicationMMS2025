import java.util.Scanner;

public class displaycount{
	
	public static void main (String []args){
	
	Scanner input = new Scanner(System.in);
	int negative = 0, positive = 0, zero = 0;
	
	
	
	while(true){
		System.out.print("Enter any number except -1: ");
		int number = input.nextInt();
		
		if(number == -1){
			break;
		}
		if(number > 0){
			positive++;
		}
		else if(number < 0){
			negative++;
		}
		else{
			zero++;
		}
		
	}
	System.out.printf("Count of positive numbers is %d%n", positive);
	System.out.printf("Count of negative numbers is %d%n", negative);
	System.out.printf("Count of zero numbers is %d%n", zero);
	
	
	
	
	}


}