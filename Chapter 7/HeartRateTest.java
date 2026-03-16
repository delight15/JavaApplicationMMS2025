import java.util.Scanner;

public class HeartRateTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String first = input.nextLine();

        System.out.print("Enter Last Name: ");
        String last = input.nextLine();

        System.out.print("Enter Birth Year: ");
        int year = input.nextInt();

        HeartRates person = new HeartRates(first,last,1,1,year);

        System.out.println("Age: " + person.getAge());
        System.out.println("Maximum Heart Rate: " + person.getMaxHeartRate());
        System.out.println("Target Range: " +
        person.getTargetMin() + " - " + person.getTargetMax());
    }
}