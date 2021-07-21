package observer.model;

import observer.interfaces.Subscriber;
import observer.interfaces.Topic;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class CatsTopic implements Topic {
    private final List<Subscriber> subscribers;
    private String message;

    public CatsTopic() { subscribers = new ArrayList<>(); }

    public void postMessage(String message) {
        this.message = message;
        out.println("Message posted to my topic: " + this.message);
        notifyObservers();
    }

    @Override
    public void register(Subscriber subscriber) {
        if (subscriber == null) throw new NullPointerException("Null Object/Subscriber");
        if (!subscribers.contains(subscriber)) subscribers.add(subscriber);
    }

    @Override
    public void unregister(Subscriber subscriber) { subscribers.remove(subscriber); }

    @Override
    public void notifyObservers() { subscribers.forEach(Subscriber::update); }

    @Override
    public Object getUpdate(Subscriber subscriber) { return message; }
}
