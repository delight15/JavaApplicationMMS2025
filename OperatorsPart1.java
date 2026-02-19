public class OperatorsPart1{
	
	public static void main (String[] args){
	
		//assignment operator(=)
		
		int num = 50;
		System.out.printf("the value of num is %d%n", num);
		
		//Arithmetic Operators(+,-,*,/,%)
		int num1 = 100;
		int num2 = 500;
		int addition = num + num2;
		System.out.printf("The sum of %d and %d is %d%n", num1,num2,addition);
		
		int subtraction = num1 - num2;
		System.out.printf("the difference between %d and %d is %d%n", num1,num2,subtraction);
		
		int multiplication = num1 * num2;
		System.out.printf("The product of %d and %d is %d%n", num1,num2,multiplication);
		
		//the double is to allow points in the division when displayed
		double quotient = (double)num1/num2;
		System.out.printf("The quotient of %d/%d is %f%n", num1,num2,quotient);
		
		int remainder = num1%num2;
		System.out.printf("The remainder between %d and %d is %d%n", num1, num2, remainder);
		
		//compound assignment operator
		num1 += num2;
		System.out.printf("The value of num1 is now %d%n", num1);
		
		num1*= num2;
		System.out.printf("The value of num1 is now %d%n", num1);
		
		num1-= num2;
		System.out.printf("The value of num1 is now %d%n", num1);
		
		num1/= num2;
		System.out.printf("The value of num1 is now %d%n", num1);
		
		num1%= num2;
		System.out.printf("The value of num1 is now %d%n", num1);
		
		//Relational operators(>,<,>=,<=,!=,==)
		int number1 = 20, number2 = 50, number3 = 200;
		
		boolean isGreater = number1 > number2;
		System.out.printf("Is %d > %d %b ?%n",number1,number2,isGreater);
		
				
		boolean isLessThan = number1 < number2;
		System.out.printf("Is %d < %d %b ?%n",number1,number2,isLessThan);

				
		boolean isGreaterThanEqualTo = number1 >= number2;
		System.out.printf("Is %d >= %d %b ?%n",number1,number2,isGreaterThanEqualTo);
		
		boolean isLessThanOrEqualTo	= number1 <= number2;
		System.out.printf("Is %d <= %d %b%n", number1,number2,isLessThanOrEqualTo);
		
		boolean isNotEqualTo = number1 != number2;
		System.out.printf("Is %d != %d %b%n", number1,number2,isNotEqualTo);
		
		boolean isEqualTo = number1 == number2;
		System.out.printf("Is %d == %d %b%n", number1,number2,isEqualTo);
		
		
		
	}
}