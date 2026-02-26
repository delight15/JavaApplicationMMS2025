import java.util.Scanner;
public class MultipleSelectionIf_Else_If{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your full name: ");
		String fullName = input.nextLine();
		
		System.out.print("Please enter your mark: ");
		int mark = input.nextInt();
		
		if(mark <= 100){
			
			if(mark >= 90) {
				System.out.printf("%s your mark is %d and grade is A(Outstanding)%n", fullName,mark);
			}
			else if(mark >= 80){
				System.out.printf("%s your mark is %d: Grade is B (Excellent)%n", fullName,mark);
			}
			else if(mark >= 70){
				System.out.printf("%s your mark is %d: Grade is C (Good)%n", fullName,mark);
			}
			else if(mark >= 60){
				System.out.printf("%s your mark is %d: Grade is D (Average)%n", fullName,mark);
			}
			else if(mark >= 50){
				System.out.printf("%s your mark is %d: Grade is E (Satisfactory)%n", fullName,mark);
			}
			else if(mark >= 40){
				System.out.printf("%s your mark is %d: Grade is F (Fail)%n", fullName,mark);
			}
			else{
				System.out.printf("%s your mark is %d: Grade is F(Fail)%n", fullName, mark);
			}
		}
		else{
			System.out.println("mark cannot be more than 100");
		}
		
	
	}
}














