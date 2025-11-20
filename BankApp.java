// BankApp.java
import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Account account = new SavingsAccount("ACC1001", 1000);

        while (true) {
            System.out.println("\n==== BANK MENU ====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Transaction History");
            System.out.println("5. Apply Interest");
            System.out.println("6. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Amount to deposit: ");
                    account.deposit(sc.nextDouble());
                    break;

                case 2:
                    System.out.print("Amount to withdraw: ");
                    account.withdraw(sc.nextDouble());
                    break;

                case 3:
                    System.out.println("Current Balance: " + account.getBalance());
                    break;

                case 4:
                    account.showHistory();
                    break;

                case 5:
                    if (account instanceof SavingsAccount sa) {
                        sa.applyInterest();
                    }
                    break;

                case 6:
                    System.out.println("Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
