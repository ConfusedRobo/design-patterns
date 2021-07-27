package demo.singleton;

import singleton.simpleager.SimpleEagerSingleton;

import static java.lang.System.out;

public class SimpleEagerSingletonMain {

    public static void main(String... args) {
        var singleton = SimpleEagerSingleton.getInstance();
        singleton.name = "Macy Love";
        out.println(singleton);
        singleton = SimpleEagerSingleton.getInstance();
        out.println(singleton);
        singleton.name = "Luke Williams";
        out.println(singleton);
    }
}
