import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = input.nextLine();

        boolean hasUpper = false;
        boolean hasNumber = false;

        for(int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if(Character.isUpperCase(ch)) {
                hasUpper = true;
            }

            if(Character.isDigit(ch)) {
                hasNumber = true;
            }
        }

        if(password.length() >= 8 && hasUpper && hasNumber) {
            System.out.println("Password strength: STRONG");
        }
        else if(password.length() >= 6) {
            System.out.println("Password strength: MEDIUM");
        }
        else {
            System.out.println("Password strength: WEAK");
        }

        input.close();
    }
}