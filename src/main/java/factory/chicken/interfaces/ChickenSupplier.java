package factory.chicken.interfaces;

import factory.chicken.models.Dishes;

public abstract class ChickenSupplier {
    public Chicken chicken;

    public abstract Chicken supplyChicken(Dishes dish, String style);
}
