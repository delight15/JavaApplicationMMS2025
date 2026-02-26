import java.util.Scanner;

public class EmploymentTest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
	    // Accept candidate name
	    System.out.print("Enter candidate name: ");
		String name = input.nextLine();
		
		
		System.out.print("Enter English Score: ");
		double english = input.nextDouble();
		
		System.out.print("Enter Mathematics Score: ");
		double mathematics = input.nextDouble();
		
		System.out.print("Enter ICT Score: ");
		double ict = input.nextDouble();
		
		// calculate average
		double average = (english + mathematics + ict) / 3;
		
		//check conditions
		if (english >= 70 && average > 80){
			System.out.printf("Candidate: %s " , name);
			
			System.out.printf("Average Score: %f ",average);
			System.out.printf("Employment Granted");
		}
		else{
			System.out.printf("Candidate: %s " ,name);
			System.out.printf("Average Score: %f ", average);
			System.out.printf("Employment Rejected");
		}
	

		
		
		
	}
}
	