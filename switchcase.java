import java.util.Scanner;

public class switchcase{
	public static void main (String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your fullname: ");
		String fullname = input.nextLine();
		
		System.out.print("Enter your mark: ");
		short mark = input.nextShort();
		
		if(mark >= 0 && mark <= 100){
			switch(mark/10){
				case 0:
				case 1:
				case 2:
				case 3:
					System.out.printf("%s your mark is %d: Grade is F(Fail)", fullname, mark);
				break;
				
				case 4:
					System.out.printf("%s your mark is %d: Grade is E(Satisfactory)", fullname, mark);
				break;
				
				case 5:
					System.out.printf("%s your mark is %d: Grade is D(Average)", fullname, mark);
				break;
				
				case 6:
					System.out.printf("%s your mark is %d: Grade is C(Good)", fullname, mark);
				break;
				
				case 7:
					System.out.printf("%s your mark is %d: Grade is B(Excellent)", fullname, mark);
				break;
				
				case 8:
				case 9:
				case 10:
					System.out.printf("%s your mark is %d: Grade is A(Outstanding)", fullname, mark);
				break;
			}
		
		}
		else{
			System.out.println("Mark cannot be greater than 100");
		}
	}
	
}