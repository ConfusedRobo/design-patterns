package decorator.rifle.models;

import decorator.rifle.interfaces.Rifle;

import static java.lang.System.out;

public class BasicRifle implements Rifle {
    public BasicRifle() { out.println("Creating a basic rifle!"); }

    @Override
    public double cost() { return 999.99; }

    @Override
    public double weight() { return 2.50; }

    @Override
    public int components() { return 1; }
}
