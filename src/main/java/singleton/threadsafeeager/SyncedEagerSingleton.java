package singleton.threadsafeeager;

public class SyncedEagerSingleton {
    private static final SyncedEagerSingleton instance = new SyncedEagerSingleton();
    public String name;

    private SyncedEagerSingleton() {}

    public synchronized static SyncedEagerSingleton getInstance() { return instance; }

    @Override
    public String toString() { return name; }

}
