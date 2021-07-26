package simplefactory.burger.models;

import simplefactory.burger.interfaces.HamburgerStore;

public class JamaicanHamburgerStore extends HamburgerStore {
    @Override
    public Hamburger createHamburger(String type) {
        return switch (type) {
            case "cheese" -> new JamaicanCheeseHamburger();
            case "veggie" -> new JamaicanVeggieHamburger();
            default -> null;
        };
    }
}
