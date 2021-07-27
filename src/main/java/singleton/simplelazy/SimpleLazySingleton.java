package singleton.simplelazy;

public class SimpleLazySingleton {
    private static SimpleLazySingleton instance;
    public String name;

    private SimpleLazySingleton() {}

    public static SimpleLazySingleton getInstance() { return instance == null ? instance = new SimpleLazySingleton() : instance; }

    @Override
    public String toString() { return name; }
}
