package oop.lab;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public double calculateInterest() {
        return 0; // No interest for checking accounts
    }

    public void payBills(double amount) {
        withdraw(amount);
        System.out.println("Paid bill of " + amount);
    }
}