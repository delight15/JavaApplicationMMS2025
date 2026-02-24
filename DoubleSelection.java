import java.util.Scanner;
public class DoubleSelection{

	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = scan.nextLine();
		
		System.out.print("Enter your age: ");
		int age = scan.nextInt();
		
		if(age >= 18){
			System.out.printf("%s your age is %d, you are now an adult", name,age);
			
		}else{
			System.out.printf("%s your age is %d, you are still a minor", name,age);
		}
	}


}