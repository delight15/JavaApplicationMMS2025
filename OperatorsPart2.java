public class OperatorsPart2{

	public static void main (String[] args){
		int num1 = 70;
		int num2 = 50;
		int num3 = 120;
		
		//LOGICAL OPERATORS(&&,||,!)
		boolean andresult = (num1 > num2) && (num1 != num3);
		System.out.printf("The result is %b%n", andresult);
		
		boolean orResult = (num1 > num2) || (num1 == num3);
		System.out.printf("The OR result is %b%n", orResult);
		
		boolean notResult = !((num1 > num2) || (num1 == num3));
		System.out.printf("The NOT result is %b%n", notResult);
		
		//UNARY OPERATORS(++,--)
		int x = 5;
		++x;
		++x;
		int y = ++x;
		System.out.println("The value of x is " + x);
		System.out.println("The value of y is " + y);
		
		x = 5;
		y = x++;
		System.out.println("The value of x is " + x);
		System.out.println("The value of y is " + y);
		
		//UNARY DECREMENT OPERATOR
		--x;
		--x;
		y = ++x;
		
		System.out.println("The value of decrement x is " + x);
		System.out.println("The value of decrement y is " + y);
		
		
		
		
	}
}