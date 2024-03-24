import java.util.Scanner;
class BankAccount {
    private String accountHolder;
    private double balance;
    BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }
    void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account holder's name: ");
        accountHolder = scanner.nextLine();
        System.out.print("Enter initial balance: ");
        balance = scanner.nextDouble();
    }
    void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: Rs." + balance);
    }
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: Rs." + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    void withdraw(double amount) {
        if (amount > 0 && getBalance() - amount >= 0) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: Rs." + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
    protected double getBalance() {
        return balance;
    }
}
class SavingsAccount extends BankAccount {
    SavingsAccount(String accountHolder, double initialBalance) {
        super(accountHolder, initialBalance);
    }
    void withdraw(double amount) {
        if (amount > 0 && getBalance() - amount >= 1000) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal not allowed. Minimum balance requirement not met.");
        }
    }
}
public class BankAccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        SavingsAccount savingsAccount = new SavingsAccount("", 1000);
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Input Data");
            System.out.println("2. Display Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    savingsAccount.inputData();
                    break;
                case 2:
                    savingsAccount.display();
                    break;
                    case 3:
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine();
                    savingsAccount.deposit(depositAmount);
                    break;
                case 4:
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawalAmount = scanner.nextDouble();
                    scanner.nextLine();
                    savingsAccount.withdraw(withdrawalAmount);
                    break;
                case 5:
                    System.out.println("Exiting program. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 5);
        scanner.close();
    }
}
