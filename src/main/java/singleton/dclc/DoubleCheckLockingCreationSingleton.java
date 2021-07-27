package singleton.dclc;

public class DoubleCheckLockingCreationSingleton {
    private static volatile DoubleCheckLockingCreationSingleton instance;
    public String name;

    private DoubleCheckLockingCreationSingleton() {}

    public static DoubleCheckLockingCreationSingleton getInstance() {
        synchronized (DoubleCheckLockingCreationSingleton.class) {
            if (instance == null) instance = new DoubleCheckLockingCreationSingleton();
        }
        return instance;
    }

    @Override
    public String toString() { return name; }
}
