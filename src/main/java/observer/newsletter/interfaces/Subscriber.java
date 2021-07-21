package observer.newsletter.interfaces;

public interface Subscriber {
    void update();
    void subscribeTo(Topic topic);
}
