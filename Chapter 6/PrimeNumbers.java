public class PrimeNumbers {

    public static void main(String[] args) {

        boolean[] prime = new boolean[1000];

        for (int i = 2; i < prime.length; i++)
            prime[i] = true;

        for (int i = 2; i < prime.length; i++) {

            if (prime[i]) {

                for (int j = i * 2; j < prime.length; j += i)
                    prime[j] = false;
            }
        }

        for (int i = 2; i < prime.length; i++) {

            if (prime[i])
                System.out.print(i + " ");
        }
    }
}