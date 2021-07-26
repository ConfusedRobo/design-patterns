package demo.factory.chicken;

import factory.chicken.models.Dishes;
import factory.chicken.stores.ContrivedChickenSupplier;

public class ChickenMain {

    public static void main(String... args) {
        var supplier = new ContrivedChickenSupplier();
        var chicken = supplier.supplyChicken(Dishes.REZALA, "Indian");

        chicken.cook(); chicken.serve();
        chicken.addIngredients("Onions", "Spices", "Butter and Ghee", "Water and Milk");
        chicken.serve();
        chicken.cook(); chicken.serve();
    }
}
