package demo.simplefactory.hamburger;

import simplefactory.burger.models.JamaicanHamburgerStore;
import simplefactory.burger.models.MozambicanHamburgerStore;

public class HamburgerMain {

    public static void main(String... args) {
        var mozambican = new MozambicanHamburgerStore();
        var jamaican = new JamaicanHamburgerStore();

        var mozCheese = mozambican.createHamburger("cheese");
        mozCheese.prepare();
    }
}
