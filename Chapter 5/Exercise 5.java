x = Math.abs(7.5);
x = Math.floor(7.5);
x = Math.abs(0.0);
x = Math.ceil(0.0);
x = Math.abs(-6.4);
x = Math.ceil(-6.4);
x = Math.ceil(-Math.abs(-8 + Math.floor(-5.5)));

import java.util.Scanner;

public class ParkingCharges {

    public static double calculateCharges(double hours) {

        double charge = 2.0;

        if (hours > 3)
            charge = 2 + Math.ceil(hours - 3) * 0.5;

        if (charge > 10)
            charge = 10;

        return charge;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double total = 0;

        for (int i = 1; i <= 3; i++) {

            System.out.print("Enter hours parked: ");
            double hours = input.nextDouble();

            double charge = calculateCharges(hours);

            System.out.printf("Customer %d charge: $%.2f%n", i, charge);

            total += charge;
        }

        System.out.printf("Total receipts: $%.2f%n", total);
    }
}

public class RoundNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        double x = input.nextDouble();

        double y = Math.floor(x + 0.5);

        System.out.println("Original number: " + x);
        System.out.println("Rounded number: " + y);
    }
}


public class RoundingNumbers {

    static double roundToInteger(double x) {
        return Math.floor(x + 0.5);
    }

    static double roundToTenths(double x) {
        return Math.floor(x * 10 + 0.5) / 10;
    }

    static double roundToHundredths(double x) {
        return Math.floor(x * 100 + 0.5) / 100;
    }

    static double roundToThousandths(double x) {
        return Math.floor(x * 1000 + 0.5) / 1000;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        double number = input.nextDouble();

        System.out.println("Original: " + number);
        System.out.println("Integer: " + roundToInteger(number));
        System.out.println("Tenths: " + roundToTenths(number));
        System.out.println("Hundredths: " + roundToHundredths(number));
        System.out.println("Thousandths: " + roundToThousandths(number));
    }
}
n = 1 + (int)(Math.random() * 2);
n = 1 + (int)(Math.random() * 100
n = (int)(Math.random() * 10);
n = -1 + (int)(Math.random() * 3);
n = -3 + (int)(Math.random() * 15);
System.out.println(2 + 2 * (int)(Math.random() * 5));
System.out.println(3 + 2 * (int)(Math.random() * 5));
System.out.println(6 + 4 * (int)(Math.random() * 5));

import java.util.Scanner;

public class IntegerPower {

    static int integerPower(int base, int exponent) {

        int result = 1;

        for (int i = 1; i <= exponent; i++)
            result *= base;

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = input.nextInt();

        System.out.print("Enter exponent: ");
        int exponent = input.nextInt();

        System.out.println("Result = " + integerPower(base, exponent));
    }
}
import java.util.Scanner;

public class Hypotenuse {

    static double hypotenuse(double side1, double side2) {

        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter side1: ");
        double s1 = input.nextDouble();

        System.out.print("Enter side2: ");
        double s2 = input.nextDouble();

        System.out.println("Hypotenuse = " + hypotenuse(s1, s2));
    }
}
import java.util.Scanner;

public class Hypotenuse {

    static double hypotenuse(double side1, double side2) {

        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter side1: ");
        double s1 = input.nextDouble();

        System.out.print("Enter side2: ");
        double s2 = input.nextDouble();

        System.out.println("Hypotenuse = " + hypotenuse(s1, s2));
    }
}

static boolean isMultiple(int a, int b) {

    return b % a == 0;
}
static boolean isEven(int number) {

    return number % 2 == 0;
}