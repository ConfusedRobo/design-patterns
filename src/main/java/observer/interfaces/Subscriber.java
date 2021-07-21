package observer.interfaces;

public interface Subscriber {
    void update();
    void setTopic(Topic topic);
}
