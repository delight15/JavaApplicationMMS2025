import java.util.Random;

public class DiceRolling {

    public static void main(String[] args) {

        Random rand = new Random();
        int[] frequency = new int[13];

        for (int i = 0; i < 36000000; i++) {

            int die1 = 1 + rand.nextInt(6);
            int die2 = 1 + rand.nextInt(6);

            int sum = die1 + die2;

            frequency[sum]++;
        }

        System.out.println("Sum\tFrequency");

        for (int i = 2; i < frequency.length; i++) {
            System.out.println(i + "\t" + frequency[i]);
        }
    }
}