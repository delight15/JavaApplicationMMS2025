import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        int[] range = new int[9];
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter weekly sales (-1 to end): ");
            int sales = input.nextInt();

            if (sales == -1)
                break;

            int salary = 200 + (int) (0.09 * sales);
            int index = (salary - 200) / 100;

            if (index > 8)
                index = 8;

            range[index]++;
        }

        System.out.println("\nSalary Range\tNumber of Salespeople");

        System.out.println("$200-299\t" + range[0]);
        System.out.println("$300-399\t" + range[1]);
        System.out.println("$400-499\t" + range[2]);
        System.out.println("$500-599\t" + range[3]);
        System.out.println("$600-699\t" + range[4]);
        System.out.println("$700-799\t" + range[5]);
        System.out.println("$800-899\t" + range[6]);
        System.out.println("$900-999\t" + range[7]);
        System.out.println("$1000+\t\t" + range[8]);
    }
}