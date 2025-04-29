package oop.lab;

public class BusinessAccount extends BankAccount implements LoanService {
    private String loanStatus;

    public BusinessAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
        this.loanStatus = "No Loan";
    }

    @Override
    public double calculateInterest() {
        double interest = balance * 0.02;
        balance += interest;
        return interest;
    }

    @Override
    public void applyForLoan(double amount) {
        loanStatus = "Pending";
        System.out.println("Applied for loan of " + amount);
    }

    @Override
    public String checkLoanStatus() {
        return loanStatus;
    }
}