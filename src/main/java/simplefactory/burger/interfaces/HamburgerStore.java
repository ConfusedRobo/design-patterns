package simplefactory.burger.interfaces;

import simplefactory.burger.models.Hamburger;

public abstract class HamburgerStore {
    public Hamburger orderHamburger(String type) {
        var burger = createHamburger(type);
        burger.prepare();
        burger.cook();
        burger.box();
        return burger;
    }

    public abstract Hamburger createHamburger(String type);
}
