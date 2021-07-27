package demo.singleton;

import singleton.threadsafeeager.SyncedEagerSingleton;

import static java.lang.System.out;

public class SyncedEagerSingletonMain {

    public static void main(String... args) {
        var singleton = SyncedEagerSingleton.getInstance();
        singleton.name = "John Doe";
        out.println(singleton);
        new Thread(() -> {
            var threadSingleton = SyncedEagerSingleton.getInstance();
            threadSingleton.name = "Jane Doe";
            out.println(threadSingleton);
        }).start();
    }
}
