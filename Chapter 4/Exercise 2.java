import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of values: ");
        int count = input.nextInt();

        int smallest = Integer.MAX_VALUE;

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number: ");
            int number = input.nextInt();

            if (number < smallest)
                smallest = number;
        }

        System.out.println("Smallest value is: " + smallest);
    }
}
for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}

| Feature         | while Loop                                | for Loop                                |
| --------------- | ----------------------------------------- | --------------------------------------- |
| Structure       | Condition only                            | Initialization, condition, increment    |
| Use             | When number of repetitions is **unknown** | When number of repetitions is **known** |
| Counter control | Must be written separately                | Built into the loop                     |
| Readability     | Less compact                              | More compact                            |

int choice;
do {
    System.out.println("1. Start");
    System.out.println("2. Exit");
    choice = input.nextInt();
} while (choice != 2);

| Statement    | Description                                                                             |
| ------------ | --------------------------------------------------------------------------------------- |
| **break**    | Immediately terminates the loop or switch statement                                     |
| **continue** | Skips the remaining code in the current iteration and continues with the next iteration |

// Erro
For (i = 100, i >= 1, i++) System.out.println(i);

//correct
for (i = 100; i >= 1; i--)
    System.out.println(i);
switch (value % 2) {
case 0:
System.out.println("Even integer");
case 1:
System.out.println("Odd integer");
}

for (i = 19; i >= 1; i += 2)
System.out.println(i);


counter = 2;

do {
    System.out.println(counter);
    counter += 2;
} while (counter <= 100);

public class OddProduct {
    public static void main(String[] args) {

        int product = 1;

        for (int i = 1; i <= 15; i += 2)
            product *= i;

        System.out.println("Product of odd integers = " + product);
    }
}
public class FactorialTable {

    public static void main(String[] args) {

        long factorial = 1;

        System.out.println("Number\tFactorial");

        for (int i = 1; i <= 20; i++) {
            factorial *= i;
            System.out.printf("%d\t%d%n", i, factorial);
        }
    }
}
public class CompoundInterest {

    public static void main(String[] args) {

        double principal = 1000;

        for (int rate = 5; rate <= 10; rate++) {

            System.out.println("Interest Rate: " + rate + "%");

            for (int year = 1; year <= 10; year++) {

                double amount = principal * Math.pow(1.0 + rate / 100.0, year);

                System.out.printf("Year %d: %.2f%n", year, amount);
            }

            System.out.println();
        }
    }
}