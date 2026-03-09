public class InitArray {

    public static void main(String[] args) {

        int size = 10;

        if (args.length > 0)
            size = Integer.parseInt(args[0]);

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = 2 + 2 * i;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " " + array[i]);
        }
    }
}