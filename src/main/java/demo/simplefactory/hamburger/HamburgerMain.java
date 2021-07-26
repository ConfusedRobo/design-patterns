package demo.simplefactory.hamburger;

import factory.burger.stores.JamaicanBurgerStore;
import factory.burger.stores.MozambicanBurgerStore;

public class HamburgerMain {

    public static void main(String... args) {
        var mozambican = new MozambicanBurgerStore();
        var jamaican = new JamaicanBurgerStore();

        var mozCheese = mozambican.createHamburger("cheese");
        var jamCheese = jamaican.createHamburger("cheese");
        jamCheese.prepare();
        mozCheese.prepare();
    }
}
