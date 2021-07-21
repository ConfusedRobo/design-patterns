package observer.newsletter.interfaces;

public interface Topic {
    void register(Subscriber subscriber);

    void unregister(Subscriber subscriber);

    void notifyObservers();

    Object fetchMessage();
}
