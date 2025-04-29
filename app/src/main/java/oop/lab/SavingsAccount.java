package oop.lab;

public class SavingsAccount extends BankAccount implements OnlineService {
    private static final double INTEREST_RATE = 0.03;

    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public double calculateInterest() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
        return interest;
    }

    @Override
    public void transferFunds(double amount, String targetAccount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds to transfer");
        }
        withdraw(amount);
        System.out.println("Transferred " + amount + " to account " + targetAccount);
    }

    @Override
    public void payBills(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds to pay bills");
        }
        withdraw(amount);
        System.out.println("Paid bill of " + amount);
    }
}