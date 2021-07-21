package observer.newsletter.models;

import observer.newsletter.interfaces.Subscriber;
import observer.newsletter.interfaces.Topic;

import static java.lang.System.out;

public class NewsletterSubscriber implements Subscriber {
    private final String name;
    private Topic topic;

    public NewsletterSubscriber(String name) { this.name = name; }

    @Override
    public void update() {
        var message = topic.fetchMessage();
        if (message == null) out.println(name + ": No new message on this topic!");
        else out.println(name + " Retrieving message: " + message);
    }

    @Override
    public void subscribeTo(Topic topic) { this.topic = topic; }
}
