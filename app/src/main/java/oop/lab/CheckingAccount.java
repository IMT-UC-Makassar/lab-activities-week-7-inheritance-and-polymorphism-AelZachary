package oop.lab;

public class CheckingAccount extends BankAccount implements OnlineService {

    public CheckingAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public double calculateInterest() {
        return 0; // No interest for checking accounts
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