package demo.observer;

import observer.technical.models.DataImplementation;
import observer.technical.models.ObserverImplementation;
import observer.technical.models.ProviderImplementation;

import static java.util.Arrays.fill;
import static java.util.Arrays.stream;

public class TechnicalMain {

    public static void main(String... args) {
        var provider = new ProviderImplementation();
        var observers = new ObserverImplementation[5];
        var data = new DataImplementation("Hello!");

        fill(observers, new ObserverImplementation());
        stream(observers).forEach(provider::add);
        provider.remove(observers[2]);
        provider.send(data);
    }
}
