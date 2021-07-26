package factory.chicken.stores;

import factory.chicken.interfaces.Chicken;
import factory.chicken.interfaces.ChickenSupplier;
import factory.chicken.models.Curry;
import factory.chicken.models.Dishes;
import factory.chicken.models.Rezala;
import factory.chicken.models.Stew;

public class ContrivedChickenSupplier extends ChickenSupplier {
    @Override
    public Chicken supplyChicken(Dishes dish, String style) {
        return switch (dish) {
            case REZALA -> new Rezala("Delaware", style);
            case CURRY -> new Curry("Cornish", style);
            case STEW -> new Stew("Catalana", style);
        };
    }
}
