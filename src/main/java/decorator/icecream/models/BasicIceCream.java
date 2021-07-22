package decorator.icecream.models;

import decorator.icecream.interfaces.IceCream;

import static java.lang.System.out;

public class BasicIceCream implements IceCream {
    public BasicIceCream() { out.println("Creating a basic Ice-Cream!"); }

    @Override
    public double cost() { return 0.50; }
}
