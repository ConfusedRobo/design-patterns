package demo.singleton;

import singleton.simplelazy.SimpleLazySingleton;

import static java.lang.System.out;

public class SimpleLazySingletonMain {

    public static void main(String... args) {
        var singleton = SimpleLazySingleton.getInstance();
        singleton.name = "John Doe";
        out.println(singleton);
        singleton = SimpleLazySingleton.getInstance();
        out.println(singleton);
        singleton.name = "Jane Doe";
        out.println(singleton);
    }
}
