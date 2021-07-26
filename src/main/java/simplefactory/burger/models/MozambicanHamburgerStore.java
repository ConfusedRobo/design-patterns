package simplefactory.burger.models;

import simplefactory.burger.interfaces.HamburgerStore;

public class MozambicanHamburgerStore extends HamburgerStore {
    @Override
    public Hamburger createHamburger(String type) {
        return switch (type) {
            case "cheese" -> new MozambicanCheeseHamburger();
            case "veggie" -> new MozambicanVeggieHamburger();
            default -> null;
        };
    }
}
