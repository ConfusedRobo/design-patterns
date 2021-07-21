package observer.technical.interfaces;

public interface Provider {
    void send(Data data);

    void add(Observer observer);

    void remove(Observer observer);
}
