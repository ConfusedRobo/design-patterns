package singleton.simpleager;

public class SimpleEagerSingleton {
    private static final SimpleEagerSingleton instance = new SimpleEagerSingleton();
    public String name;

    private SimpleEagerSingleton() {}

    public static SimpleEagerSingleton getInstance() { return instance; }

    @Override
    public String toString() { return name; }
}
