package oop.lab;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public double calculateInterest() {
        // Checking accounts typically have no interest
        return 0;
    }

    public void payBills(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds to pay bills");
        }
        withdraw(amount);
        System.out.println("Paid bill of " + amount);
    }
}