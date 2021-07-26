package factory.burger.interfaces;

public abstract class BurgerStore {
    public Hamburger orderHamburger(String type) {
        var burger = createHamburger(type);
        burger.prepare();
        burger.cook();
        burger.box();
        return burger;
    }

    public abstract Hamburger createHamburger(String type);
}
