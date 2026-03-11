import java.util.Random;

public class PassWordGenerator{
	public static void main(String[] args){
		System.out.println("Generated Password: " + generatorpassword());
	}
	public static String generatorpassword(){
		
		Random random = new Random();
		
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String symbols = "!@#$%**&";
		
		String allCharacters = upper + lower + numbers + symbols;
		
		String password = " ";
		
		for (int i = 0; i < 18; i++){
			int index = random.nextInt(allCharacters.length());
			password += allCharacters.charAt(index);
		}
		
		return password;
	}
}	
	