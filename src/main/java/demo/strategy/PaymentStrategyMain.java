package demo.strategy;

import strategy.payment.controllers.CreditCardAlgorithm;
import strategy.payment.controllers.PaypalAlgorithm;
import strategy.payment.controllers.ShoppingCart;
import strategy.payment.models.Product;

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
