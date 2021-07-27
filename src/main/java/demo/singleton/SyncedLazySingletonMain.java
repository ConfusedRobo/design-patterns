package demo.singleton;

import singleton.threadsafelazy.SyncedLazySingleton;

import static java.lang.System.out;

public class SyncedLazySingletonMain {

    public static void main(String... args) {
        var singleton = SyncedLazySingleton.getInstance();
        singleton.name = "John Doe";
        out.println(singleton);
        new Thread(() -> {
            var threadSingleton = SyncedLazySingleton.getInstance();
            threadSingleton.name = "Jane Doe";
            out.println(threadSingleton);
        }).start();
    }
}
