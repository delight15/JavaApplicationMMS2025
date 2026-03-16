public class SavingsAccountTest {

    public static void main(String[] args) {

        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        // set interest rate to 4%
        SavingsAccount.modifyInterestRate(0.04);

        System.out.println("Balances for 12 months at 4% interest:\n");

        for(int month = 1; month <= 12; month++) {

            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();

            System.out.printf(
                "Month %d:\nSaver1 Balance = $%.2f\nSaver2 Balance = $%.2f\n\n",
                month,
                saver1.getBalance(),
                saver2.getBalance()
            );
        }

        // change interest rate to 5%
        SavingsAccount.modifyInterestRate(0.05);

        System.out.println("Next month with 5% interest:\n");

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.printf(
            "Saver1 Balance = $%.2f\nSaver2 Balance = $%.2f\n",
            saver1.getBalance(),
            saver2.getBalance()
        );
    }
}