package factory.burger.stores;

import factory.burger.interfaces.Hamburger;
import factory.burger.interfaces.BurgerStore;
import factory.burger.models.JamaicanCheeseHamburger;
import factory.burger.models.JamaicanVeggieHamburger;

public class JamaicanBurgerStore extends BurgerStore {
    @Override
    public Hamburger createHamburger(String type) {
        return switch (type) {
            case "cheese" -> new JamaicanCheeseHamburger();
            case "veggie" -> new JamaicanVeggieHamburger();
            default -> null;
        };
    }
}
