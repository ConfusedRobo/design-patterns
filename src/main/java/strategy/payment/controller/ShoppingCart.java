package strategy.payment.controller;

import strategy.payment.model.Product;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ALL")
public class ShoppingCart {
    List<Product> productList;

    public ShoppingCart() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeProduct(Product product) {
        productList.remove(product);
    }

    public int calculateTotal() {
        return productList.stream().mapToInt(Product::getPrice).sum();
    }

    public void pay(Payment paymentStrategy) {
        int amount = calculateTotal();
        paymentStrategy.pay(amount);
    }
}
