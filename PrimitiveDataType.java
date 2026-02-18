public class PrimitiveDataType{

	public static void main(String[] args){
		// WHOLE NUMBER PRIMITVE DATA TYPES
		
		
		// byte is a datatype with 8 bits and can hold -128 to 127 in numbers
		byte age = 30;
		System.out.printf("I am %d years old %n", age);
		
		
		// short is a datatype with 16 bits and can hold -32,768 to 32,767 in numbers
		short quantityOfBags = 10000;
		System.out.printf("The quantity of bags ordered is %d %n" , quantityOfBags);
		
		// int is a datatype with 32 bits and can hold -2,147,483,648 to 2,147,483,647 in numbers
		int nigeriaPopulation = 2000000000;
		System.out.printf("The population of Nigeria is %d%n", nigeriaPopulation);
		
		
		long worldspopulation = 9000000000000L;
		System.out.printf("The worlds population is %d%n", worldspopulation);
		
		
		// FLOAT-POINT PRIMITIVE DATA TYPE
		
		float myBalance = 6945.6000057F	;
		System.out.printf("My Account balance is %.2f%n", myBalance);
		
		double cBNBalance = 9874466464.904;
		System.out.printf("CBN account balance is %f%n", cBNBalance);

		// SINGNLECHARACTER PRIMITIVE DATATYPE
		
		char symbol = '$';
		System.out.printf("My Account balance is %c%.2f%n", symbol,myBalance);
		
		// boolean primitive data type
		boolean isjavaFun = true;
		System.out.printf("Do you love learning java? %b%n", isjavaFun);
	}
}