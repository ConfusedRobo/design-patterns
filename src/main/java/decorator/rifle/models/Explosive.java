package decorator.rifle.models;

import decorator.rifle.interfaces.Rifle;
import decorator.rifle.interfaces.RifleDecorator;

import static java.lang.System.out;

public class Explosive extends RifleDecorator {
    public Explosive(Rifle rifle) {
        super(rifle);
        out.println("Attached an explosive to your rifle!");
    }

    @Override
    public double cost() { return super.cost() + 100.00; }

    @Override
    public double weight() { return super.weight() + 2.00; }

    @Override
    public int components() {
        return super.components() + 1;
    }
}
