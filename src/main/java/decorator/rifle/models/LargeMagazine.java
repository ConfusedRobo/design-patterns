package decorator.rifle.models;

import decorator.rifle.interfaces.Rifle;
import decorator.rifle.interfaces.RifleDecorator;

import static java.lang.System.out;

public class LargeMagazine extends RifleDecorator {
    public LargeMagazine(Rifle rifle) {
        super(rifle);
        out.println("Attached a large magazine to your rifle!");
    }

    @Override
    public double cost() { return super.cost() + 50.00; }

    @Override
    public double weight() { return super.weight() + 1.00; }

    @Override
    public int components() {
        return super.components() + 1;
    }
}
