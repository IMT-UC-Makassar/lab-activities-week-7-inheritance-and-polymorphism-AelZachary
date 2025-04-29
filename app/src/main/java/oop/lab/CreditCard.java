package oop.lab;

public class CreditCard extends Card {
    private static final double INTEREST_RATE = 15.0;

    public CreditCard(String cardNumber, String cardHolder) {
        super(cardNumber, cardHolder);
    }

    @Override
    public double getInterestRate() {
        return INTEREST_RATE;
    }
}