package decorator.icecream.models;

import decorator.icecream.interfaces.IceCream;
import decorator.icecream.interfaces.IceCreamDecorator;

import static java.lang.System.out;

public class ChocolateIceCream extends IceCreamDecorator {
    public ChocolateIceCream(IceCream iceCream) { super(iceCream); }

    @Override
    public double cost() {
        out.println("Adding Chocolate!");
        return 1.0 + super.cost();
    }
}
