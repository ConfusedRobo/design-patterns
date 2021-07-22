package decorator.rifle.interfaces;

public class RifleDecorator implements Rifle {
    private final Rifle rifle;

    public RifleDecorator(Rifle rifle) { this.rifle = rifle; }

    @Override
    public double cost() { return rifle.cost(); }

    @Override
    public double weight() { return rifle.weight(); }

    @Override
    public int components() { return rifle.components(); }
}
