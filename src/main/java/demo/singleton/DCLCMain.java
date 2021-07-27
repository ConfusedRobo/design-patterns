package demo.singleton;

import singleton.dclc.DoubleCheckLockingCreationSingleton;

import java.util.concurrent.Executors;

import static java.lang.System.out;

public class DCLCMain {

    public static void main(String... args) {
        var singleton = DoubleCheckLockingCreationSingleton.getInstance();
        singleton.name = "John Doe";
        out.println(singleton);
        var service = Executors.newSingleThreadExecutor();
        service.submit(new Thread(() -> {
            var threadSingleton = DoubleCheckLockingCreationSingleton.getInstance();
            threadSingleton.name = "Jane Doe";
            out.println(threadSingleton);
        }));
        service.submit(new Thread(() -> {
            var threadSingleton = DoubleCheckLockingCreationSingleton.getInstance();
            threadSingleton.name = "Jake Doe";
            out.println(threadSingleton);
        }));
        service.submit(new Thread(() -> {
            var threadSingleton = DoubleCheckLockingCreationSingleton.getInstance();
            threadSingleton.name = "Jason Doe";
            out.println(threadSingleton);
        }));
        service.submit(new Thread(() -> {
            var threadSingleton = DoubleCheckLockingCreationSingleton.getInstance();
            threadSingleton.name = "Jamie Doe";
            out.println(threadSingleton);
        }));
        service.submit(new Thread(() -> {
            var threadSingleton = DoubleCheckLockingCreationSingleton.getInstance();
            threadSingleton.name = "Janice Doe";
            out.println(threadSingleton);
        }));
        service.shutdown();
    }
}
