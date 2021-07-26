package factory.burger.stores;

import factory.burger.interfaces.Hamburger;
import factory.burger.interfaces.BurgerStore;
import factory.burger.models.MozambicanCheeseBurger;
import factory.burger.models.MozambicanVeggieBurger;

public class MozambicanBurgerStore extends BurgerStore {
    @Override
    public Hamburger createHamburger(String type) {
        return switch (type) {
            case "cheese" -> new MozambicanCheeseBurger();
            case "veggie" -> new MozambicanVeggieBurger();
            default -> null;
        };
    }
}
