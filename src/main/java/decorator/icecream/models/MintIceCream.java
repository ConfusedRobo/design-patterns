package decorator.icecream.models;

import decorator.icecream.interfaces.IceCream;
import decorator.icecream.interfaces.IceCreamDecorator;

import static java.lang.System.out;

public class MintIceCream extends IceCreamDecorator {
    public MintIceCream(IceCream iceCream) { super(iceCream); }

    @Override
    public double cost() {
        out.println("Adding Mint!");
        return 1.50 + super.cost();
    }
}
