import java.util.Scanner;
abstract class BankAccount {
    protected String accountHolder;
    protected double balance;
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    void inputCustData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Holder's Name: ");
        accountHolder = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        balance = Double.parseDouble(sc.nextLine());
        // sc.close();
    }
    void showCustData() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
    public int getBalance() {
        throw new UnsupportedOperationException("Unimplemented method 'getBalance'");
    }
    public void setBalance(double d) {
        throw new UnsupportedOperationException("Unimplemented method 'setBalance'");
    }
}
class SavingsAccount extends BankAccount {
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit Successful");
    }
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal Successful");
        } else {
            System.out.println("Insufficient Funds");
        }
    }
}
class CurrentAccount extends BankAccount {
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit Successful");
    }
    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawal Successful");
    }
}
class Interest1 {
    private double interestRate = 0.04;
    void applyInterest(BankAccount account) {
        account.setBalance(account.getBalance() + account.getBalance() * interestRate);
        System.out.println("Interest Applied: " + (account.getBalance() * interestRate));
    }
    public void applyInterest() {
        throw new UnsupportedOperationException("Unimplemented method 'applyInterest'");
    }
}
class Interest2 {
    private double interestRate = 0.02; 
    void applyInterest(BankAccount account) {
        account.setBalance(account.getBalance() + account.getBalance() * interestRate);
        System.out.println("Interest Applied: " + (account.getBalance() * interestRate));
    }
    public void applyInterest() {
        throw new UnsupportedOperationException("Unimplemented method 'applyInterest'");
    }
}
public class BankAccountTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingsAccount savingsAccount = new SavingsAccount();
        CurrentAccount currentAccount = new CurrentAccount();
        Interest1 interest1 = new Interest1();
        Interest2 interest2 = new Interest2();
        int choice;
        do {
            System.out.println("\n*** Menu ***");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Current Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Display Account Details");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("\nCreating Savings Account...");
                    savingsAccount.inputCustData();
                    // sc.nextLine();
                    break;
                case 2:
                    System.out.println("\nCreating Current Account...");
                    currentAccount.inputCustData();
                    // sc.nextLine();
                    break;
                case 3:
                    System.out.print("\nEnter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    System.out.println("Select Account Type:");
                    System.out.println("1. Savings Account");
                    System.out.println("2. Current Account");
                    int accountType = sc.nextInt();
                    if (accountType == 1) {
                        savingsAccount.deposit(depositAmount);
                    } else if (accountType == 2) {
                        currentAccount.deposit(depositAmount);
                    } else {
                        System.out.println("Invalid Account Type");
                    }
                    break;
                case 4:
                    System.out.print("\nEnter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    System.out.println("Select Account Type:");
                    System.out.println("1. Savings Account");
                    System.out.println("2. Current Account");
                    accountType = sc.nextInt();
                    if (accountType == 1) {
                        savingsAccount.withdraw(withdrawAmount);
                    } else if (accountType == 2) {
                        currentAccount.withdraw(withdrawAmount);
                    } else {
                        System.out.println("Invalid Account Type");
                    }
                    break;
                case 5:
                    System.out.println("\nDisplaying Account Details...");
                    System.out.println("Select Account Type:");
                    System.out.println("1. Savings Account");
                    System.out.println("2. Current Account");
                    accountType = Integer.parseInt(sc.nextLine());
                    if (accountType == 1) {
                        savingsAccount.showCustData();
                    } else if (accountType == 2) {
                        currentAccount.showCustData();
                    } else {
                        System.out.println("Invalid Account Type");
                    }
                    break;
                case 6:
                    System.out.println("\nApplying Interest...");
                    System.out.println("Select Account Type:");
                    System.out.println("1. Savings Account (4%)");
                    System.out.println("2. Current Account (2%)");
                    accountType = Integer.parseInt(sc.nextLine());
                    if (accountType == 1) {
                        interest1.applyInterest();
                    } else if (accountType == 2) {
                        interest2.applyInterest();
                    } else {
                        System.out.println("Invalid Account Type");
                    }
                    break;
                case 0:
                    System.out.println("Exiting Program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 0);
        sc.close();
    }
}
