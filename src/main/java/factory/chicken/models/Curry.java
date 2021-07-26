package factory.chicken.models;

import factory.chicken.interfaces.Chicken;

import static java.lang.System.out;

public class Curry extends Chicken {
    private final boolean[] ready = new boolean[2];

    public Curry(String breed, String style) { super(breed, style); }

    @Override
    public void addIngredients(String... items) { super.addIngredients(items); ready[0] = true; }

    @Override
    public void cook() {
        if (!ready[0]) { out.println("Add the ingredients first!"); return; }
        out.println("Mixing and adding spices to the curry...");
        ready[1] = true; out.println("Finished cooking " + style + " curry!");
    }

    @Override
    public void serve() {
        if (!ready[1]) { out.println("Cook the curry first!"); return; }
        out.println("Serving " + style + " curry with " + breed + " chicken!");
    }
}
