package factory.chicken.models;

import factory.chicken.interfaces.Chicken;

import static java.lang.System.out;

public class Rezala extends Chicken {
    private final boolean[] ready = new boolean[2];

    public Rezala(String breed, String style) { super(breed, style); }

    @Override
    public void addIngredients(String... items) { super.addIngredients(items); ready[0] = true; }

    @Override
    public void cook() {
        if (!ready[0]) { out.println("Add the ingredients first!"); return; }
        out.println("Frying and mixing all of the rezala ingredients...");
        ready[1] = true; out.println("Finished cooking " + style + " rezala!");
    }

    @Override
    public void serve() {
        if (!ready[1]) { out.println("Cook the rezala first!"); return; }
        out.println("Serving " + style + " rezala with " + breed + " chicken!");
    }
}
