package strategy.payment.controller;

import static java.lang.System.out;

@SuppressWarnings("ALL")
public class PaypalAlgorithm implements Payment {
    private String email;
    private String password;

    public PaypalAlgorithm(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        out.println(amount + " paid with Paypal");
    }
}
