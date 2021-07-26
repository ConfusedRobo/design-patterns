package factory.chicken.interfaces;

import static java.lang.System.out;
import static java.util.Arrays.stream;

public abstract class Chicken {
    public final String breed;
    public final String style;

    public Chicken(String breed, String style) { this.breed = breed; this.style = style; }

    public void addIngredients(String... items) {
        stream(items).forEach(item -> out.format("Adding %s...%n", item));
    }

    public abstract void cook();

    public abstract void serve();
}
