package factory.burger.models;

import factory.burger.interfaces.Hamburger;

import static java.lang.System.out;

public class JamaicanCheeseHamburger extends Hamburger {
    public JamaicanCheeseHamburger() {
        name = "Jamaican styled Cheese Burger";
        sauce = "Spicy Jamaican Sauce";
        buns = "Cookie Dough Buns";
    }

    public void prepare() { out.println("Cooking Jamaican Styled!"); }
}
