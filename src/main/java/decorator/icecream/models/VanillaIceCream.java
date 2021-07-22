package decorator.icecream.models;

import decorator.icecream.interfaces.IceCream;
import decorator.icecream.interfaces.IceCreamDecorator;

import static java.lang.System.out;

public class VanillaIceCream extends IceCreamDecorator {
    public VanillaIceCream(IceCream iceCream) { super(iceCream); }

    @Override
    public double cost() {
        out.println("Adding Vanilla!");
        return super.cost() + 1.0;
    }
}
