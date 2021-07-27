package singleton.threadsafelazy;

public class SyncedLazySingleton {
    private static SyncedLazySingleton instance;
    public String name;

    private SyncedLazySingleton() {}

    public synchronized static SyncedLazySingleton getInstance() {
        return instance == null ? instance = new SyncedLazySingleton() : instance;
    }

    @Override
    public String toString() { return name; }

}
