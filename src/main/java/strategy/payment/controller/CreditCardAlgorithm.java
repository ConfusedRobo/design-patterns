package strategy.payment.controller;

import static java.lang.System.out;

@SuppressWarnings("ALL")
public class CreditCardAlgorithm implements Payment {
    private String name;
    private String cardNumber;

    public CreditCardAlgorithm(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        out.println(amount + " paid with Card");
    }
}
