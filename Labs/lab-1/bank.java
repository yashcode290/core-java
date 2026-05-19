class Bank {

    // This variable stores the bank balance
    double amount;

    // Constructor to set initial balance
    Bank(double amount) {
        this.amount = amount;
    }

    // Method for withdrawing money
    void withdraw(double withdrawalAmount) {

        // Checking balance using ternary operator
        String message = (withdrawalAmount <= amount)
                ? "Withdrawal successful"
                : "Insufficient balance";

        System.out.println(message);

        // If balance is enough then deduct money
        if (withdrawalAmount <= amount) {
            amount = amount - withdrawalAmount;
        }
    }

    // Method for depositing money
    void deposit(double depositAmount) {
        amount = amount + depositAmount;

        System.out.println("5000 deposited successfully");
    }

    // Main method
    public static void main(String[] args) {

        // Creating bank object with initial balance 10000
        Bank b1 = new Bank(10000);

        // Withdraw 3000
        b1.withdraw(3000);

        // Deposit 5000
        b1.deposit(5000);

        // Print final balance
        System.out.println("Total Balance = " + b1.amount);
    }
}