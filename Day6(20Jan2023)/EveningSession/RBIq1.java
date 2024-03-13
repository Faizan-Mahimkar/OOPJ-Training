interface RBI {
    void calculateInterest();
}

abstract class BankAccount implements RBI {
    double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    abstract void displayAccountDetails();
}

class SavingAccount extends BankAccount {
    double interestRate;

    public SavingAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
    }

    void displayAccountDetails() {
        System.out.println("Saving Account - Balance: " + balance + ", Interest Rate: " + interestRate + "%");
    }
}

class CurrentAccount extends BankAccount {
    
    // Constructor for CurrentAccount
    public CurrentAccount(double balance) {
        super(balance);
    }

    public void calculateInterest() {
        // Implement the logic for calculating interest for CurrentAccount if needed
        // In this example, we leave it empty since CurrentAccount might not have interest
    }

    void displayAccountDetails() {
        System.out.println("Current Account - Balance: " + balance);
    }

    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount(1000, 4);
        CurrentAccount currentAccount = new CurrentAccount(2000);

        savingAccount.calculateInterest();
        savingAccount.displayAccountDetails();

        currentAccount.calculateInterest(); // Note: Even if it's empty, you need to call it to satisfy the interface
        currentAccount.displayAccountDetails();
    }
}
