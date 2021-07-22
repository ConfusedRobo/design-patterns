package demo.decorator;

import decorator.rifle.interfaces.Rifle;
import decorator.rifle.models.BasicRifle;
import decorator.rifle.models.Explosive;
import decorator.rifle.models.Scope;
import org.jetbrains.annotations.NotNull;

import static java.lang.System.out;

public class RifleMain {

    public static void main(String... args) {
        var rifle = (Rifle) new BasicRifle();
        rifle = new Scope(rifle);
        rifle = new Explosive(rifle);
        rifleProperties(rifle);
    }

    public static void rifleProperties(@NotNull Rifle rifle) {
        out.format("Cost: %.2f%nWeight: %.2f%nComponents: %s%n", rifle.cost(), rifle.weight(), rifle.components());
    }
}
