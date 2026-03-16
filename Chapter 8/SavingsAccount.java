public class SavingsAccount {

    private static double annualInterestRate;
    private double savingsBalance;

    // constructor
    public SavingsAccount(double balance) {
        savingsBalance = balance;
    }

    // calculate monthly interest
    public void calculateMonthlyInterest() {

        double monthlyInterest =
                (savingsBalance * annualInterestRate) / 12;

        savingsBalance += monthlyInterest;
    }

    // change interest rate
    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    // get balance
    public double getBalance() {
        return savingsBalance;
    }
}