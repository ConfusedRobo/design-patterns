package demo.strategy;

import strategy.payment.controller.CreditCardAlgorithm;
import strategy.payment.controller.PaypalAlgorithm;
import strategy.payment.controller.ShoppingCart;
import strategy.payment.model.Product;

public class PaymentStrategyMain {

    public static void main(String... args) {
        var cart = new ShoppingCart();
        var pant = new Product("234", 25);
        var shirt = new Product("987", 15);

        cart.addProduct(pant);
        cart.addProduct(shirt);

        cart.pay(new PaypalAlgorithm("example@lorem.com", "12#45"));
        cart.pay(new CreditCardAlgorithm("lorem@ipsum.com", "63&54"));
    }
}
