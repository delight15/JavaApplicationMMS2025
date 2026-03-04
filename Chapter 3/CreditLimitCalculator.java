import java.util.Scanner;

public class CreditLimitCalculator{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int accountNumber;

        System.out.print("Enter account number (-1 to quit): ");
        accountNumber = input.nextInt();

        while (accountNumber != -1) {

            System.out.print("Enter beginning balance: ");
            int beginningBalance = input.nextInt();

            System.out.print("Enter total charges: ");
            int charges = input.nextInt();

            System.out.print("Enter total credits: ");
            int credits = input.nextInt();

            System.out.print("Enter credit limit: ");
            int creditLimit = input.nextInt();

            
            int newBalance = beginningBalance + charges - credits;

           
            System.out.println("New balance: " + newBalance);

            // Check credit limit
            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded");
            }

            System.out.println(); 
			

            System.out.print("Enter account number (-1 to quit): ");
            accountNumber = input.nextInt();
        }

        System.out.println("Program ended.");
        input.close();
    }
}