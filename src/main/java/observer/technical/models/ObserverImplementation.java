package observer.technical.models;

import observer.technical.interfaces.Data;
import observer.technical.interfaces.Observer;

import static java.lang.System.out;

public class ObserverImplementation implements Observer {
    @Override
    public void receive(Data data) { out.println(data.get()); }
}
