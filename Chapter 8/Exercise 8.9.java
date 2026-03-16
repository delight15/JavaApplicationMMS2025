import static java.lang.Math.random;
import static java.lang.Math.sqrt;

public class StaticImportExample {

    public static void main(String[] args) {

        double number = random() * 100;
        double result = sqrt(number);

        System.out.println("Random Number: " + number);
        System.out.println("Square Root: " + result);
    }
}