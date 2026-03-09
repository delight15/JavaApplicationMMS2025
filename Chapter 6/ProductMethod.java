public class ProductMethod {

    public static int product(int... numbers) {
        int result = 1;

        for (int n : numbers) {
            result *= n;
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(product(2,3));
        System.out.println(product(2,3,4));
        System.out.println(product(2,3,4,5));
    }
}