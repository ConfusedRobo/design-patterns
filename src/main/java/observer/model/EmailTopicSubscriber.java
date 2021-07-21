package observer.model;

import observer.interfaces.Subscriber;
import observer.interfaces.Topic;

import static java.lang.System.out;

public class EmailTopicSubscriber implements Subscriber {
    private final String name;
    private Topic topic;

    public EmailTopicSubscriber(String name) { this.name = name; }

    @Override
    public void update() {
        var message = topic.getUpdate(this);
        if (message == null) out.println(name + ": No new message on this topic!");
        else out.println(name + " Retrieving message: " + message);
    }

    @Override
    public void setSubject(Topic topic) { this.topic = topic; }
}
