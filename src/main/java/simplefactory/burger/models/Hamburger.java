package simplefactory.burger.models;

import static java.lang.System.out;

public abstract class Hamburger {
    public String name;
    public String sauce;
    public String buns;

    public void prepare() {
        out.println("Preparing " + name + " burger...");
        out.println("Adding " + sauce + " sauce...");
        out.println("Adding " + buns + " buns...");
    }

    public void cook() { out.println("Cooking" + name + " burger..."); }

    public void box() { out.println("Boxing" + name + " burger..."); }
}
