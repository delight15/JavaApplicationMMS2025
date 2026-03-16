public class DateTest {
    public static void main(String[] args) {

        Date date = new Date(12, 31, 2024);

        System.out.println("Current date: " + date);

        date.nextDay();
        System.out.println("Next day: " + date);

        date.nextMonth();
        System.out.println("Next month: " + date);

        date.nextYear();
        System.out.println("Next year: " + date);
    }
}