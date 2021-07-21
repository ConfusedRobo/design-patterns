package observer.technical.models;

import observer.technical.interfaces.Data;
import observer.technical.interfaces.Observer;
import observer.technical.interfaces.Provider;

import java.util.ArrayList;
import java.util.List;

public class ProviderImplementation implements Provider {
    private final List<Observer> observers = new ArrayList<>(5);

    @Override
    public void send(Data data) { observers.forEach(observer -> observer.receive(data)); }

    @Override
    public void add(Observer observer) { observers.add(observer); }

    @Override
    public void remove(Observer observer) { observers.remove(observer); }
}
