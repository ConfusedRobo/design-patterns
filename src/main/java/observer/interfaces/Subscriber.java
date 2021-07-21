package observer.interfaces;

public interface Subscriber {
    void update();
    void setSubject(Topic topic);
}
