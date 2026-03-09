import java.util.Random;
//import java.util.* : means you can select all inside utility and to use them youjust have to create
//the object of that class like e.g Scanner input = new Scanner();

public class numbergenerator{


	public static void main (String[] args){
		
		Random rand = new Random();
		
		//any integer
		System.out.println(rand.nextInt());
		
		//generate a specified number
		System.out.println(rand.nextInt(20)+1);
		
		//generate any double
		System.out.println(rand.nextDouble());
		
		//generate any boolean
		System.out.println(rand.nextBoolean());
		
		
		
	}

}