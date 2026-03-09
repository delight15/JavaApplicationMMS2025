import java.util.Scanner;

public class AirlineReservation{

    public static void main(String[] args) {

        boolean[] seats = new boolean[10];
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("1 First Class");
            System.out.println("2 Economy");

            int choice = input.nextInt();

            if (choice == 1) {
                for (int i = 0; i < 5; i++) {
                    if (!seats[i]) {
                        seats[i] = true;
                        System.out.println("Seat " + (i+1) + " First Class");
                        break;
                    }
                }
            }

            else if (choice == 2) {
                for (int i = 5; i < 10; i++) {
                    if (!seats[i]) {
                        seats[i] = true;
                        System.out.println("Seat " + (i+1) + " Economy");
                        break;
                    }
                }
            }
        }
    }
}