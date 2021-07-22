package demo.decorator;

import decorator.icecream.interfaces.IceCream;
import decorator.icecream.models.BasicIceCream;
import decorator.icecream.models.MintIceCream;
import decorator.icecream.models.VanillaIceCream;

import static java.lang.System.out;

public class IceCreamMain {

    public static void main(String... args) {
        var iceCream = (IceCream) new BasicIceCream();
        out.println("Basic Ice-Cream cost is $" + iceCream.cost());
        iceCream = new VanillaIceCream(iceCream);
        out.println("Vanilla Ice-Cream cost is $" + iceCream.cost());
        iceCream = new MintIceCream(iceCream);
        out.println("Mint Ice-Cream cost is $" + iceCream.cost());
    }
}
