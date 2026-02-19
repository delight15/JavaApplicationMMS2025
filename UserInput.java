import java.util.Scanner;


public class UserInput{

	public static void main (String[] args){
		
		Scanner Scan = new Scanner(System.in);
		
		System.out.print("Please enter your full name: ");
		String fullName = Scan.nextLine();
		
		System.out.print("Enter your address: ");
		String address = Scan.nextLine();
		
		System.out.print("Enter your age: ");
		int age = Scan.nextInt();
		Scan.nextLine();
		
		System.out.print("Enter your gender(M/F): ");
		String gender = Scan.nextLine();
		
		System.out.printf("Are you happy to learn Java? (true/false): ");
		boolean isHappy = Scan.nextBoolean();
		
		
		System.out.println("");
		System.out.println("");	
		
		System.out.printf("Hello %s how are you today ?%n", fullName);
		System.out.printf("Nice meeting you %s, you are living in %s%n", fullName, address);
		System.out.printf("%s you are %dyears old%n", fullName,age);
		System.out.printf("You are a %s%n", gender);
		System.out.printf("Are you happy to learn Java? %b%n ", isHappy);
	
	}
}