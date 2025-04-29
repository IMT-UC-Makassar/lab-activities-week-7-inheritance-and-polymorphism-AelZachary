package oop.lab;

public class PlatinumCard extends CreditCard {
    private static final double INTEREST_RATE = 10.0;

    public PlatinumCard(String cardNumber, String cardHolder) {
        super(cardNumber, cardHolder);
    }

    @Override
    public double getInterestRate() {
        return INTEREST_RATE;
    }
}