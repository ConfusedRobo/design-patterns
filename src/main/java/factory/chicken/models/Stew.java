package factory.chicken.models;

import factory.chicken.interfaces.Chicken;

import static java.lang.System.out;

public class Stew extends Chicken {
    private final boolean[] ready = new boolean[2];

    public Stew(String breed, String style) { super(breed, style); }

    @Override
    public void addIngredients(String... items) { super.addIngredients(items); ready[0] = true; }

    @Override
    public void cook() {
        if (!ready[0]) { out.println("Add the ingredients first!"); return; }
        out.println("Boiling all of the stew ingredients...");
        ready[1] = true; out.println("Finished cooking " + style + " stew!");
    }

    @Override
    public void serve() {
        if (!ready[1]) { out.println("Cook the stew first!"); return; }
        out.println("Serving " + style + " stew with " + breed + " chicken!");
    }
}
