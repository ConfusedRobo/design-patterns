package decorator.rifle.models;

import decorator.rifle.interfaces.Rifle;
import decorator.rifle.interfaces.RifleDecorator;

import static java.lang.System.out;

public class Scope extends RifleDecorator {
    public Scope(Rifle rifle) {
        super(rifle);
        out.println("Attached a scope to your rifle!");
    }

    @Override
    public double cost() { return super.cost() + 80.00; }

    @Override
    public double weight() { return super.weight() + 1.55; }

    @Override
    public int components() { return super.components() + 1; }
}
