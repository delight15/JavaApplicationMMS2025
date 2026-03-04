import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double totalSales = 0.0;
        double itemPrice;

        System.out.print("Enter item price (-1 to end): ");
        itemPrice = input.nextDouble();

        while (itemPrice != -1) {
            totalSales += itemPrice;
            System.out.print("Enter item price (-1 to end): ");
            itemPrice = input.nextDouble();
        }

        double earnings = 200 + (0.09 * totalSales);

        System.out.printf("Total Sales: %.2f%n", totalSales);
        System.out.printf("Weekly Earnings: %.2f%n", earnings);

        input.close();
    }
}