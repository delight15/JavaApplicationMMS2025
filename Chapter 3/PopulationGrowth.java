public class PopulationGrowth {
    public static void main(String[] args) {

        double population = 8000000000.0; // example
        double growthRate = 0.01; // 1%

        System.out.println("Year\tPopulation\tIncrease");

        for (int year = 1; year <= 75; year++) {

            double increase = population * growthRate;
            population += increase;

            System.out.printf("%d\t%.0f\t%.0f%n", year, population, increase);
        }
    }
}