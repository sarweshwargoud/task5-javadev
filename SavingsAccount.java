// SavingsAccount.java
public class SavingsAccount extends Account {

    private double interestRate = 0.02; // 2%

    public SavingsAccount(String accountNumber, double openingBalance) {
        super(accountNumber, openingBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount < 500) {
            System.out.println("Minimum balance of 500 required!");
            return;
        }
        super.withdraw(amount);
    }

    public void applyInterest() {
        double interest = balance * interestRate;
        balance += interest;
        transactions.add("Interest added: " + interest + " | New Balance: " + balance);
        System.out.println("Interest applied.");
    }
}
