import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int miles;
        int gallons;

        int totalMiles = 0;
        int totalGallons = 0;

        System.out.print("Enter miles driven (-1 to quit): ");
        miles = input.nextInt();

        while (miles != -1) {

            System.out.print("Enter gallons used: ");
            gallons = input.nextInt();

            // Calculate MPG for this trip 
            double mpg = (double) miles / gallons;
            System.out.printf("Miles per gallon for this trip: %.2f%n", mpg);

            // Add to totals
            totalMiles += miles;
            totalGallons += gallons;

            // Calculate combined 
            double combinedMPG = (double) totalMiles / totalGallons;
            System.out.printf("Combined miles per gallon: %.2f%n%n", combinedMPG);

            System.out.print("Enter miles driven (-1 to quit): ");
            miles = input.nextInt();
        }

        System.out.println("Program ended.");
        input.close();
    }
}

import java.util.Scanner;

public class CreditLimitCalculator {

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