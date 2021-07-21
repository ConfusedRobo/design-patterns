package demo.observer;

import observer.model.CatsTopic;
import observer.model.EmailTopicSubscriber;

import static java.lang.System.out;

public class NewsletterMain {

    public static void main(String... args) {
        var topic = new CatsTopic();
        var firstObserver = new EmailTopicSubscriber("First Subscriber");
        var secondObserver = new EmailTopicSubscriber("Second Subscriber");
        var thirdObserver = new EmailTopicSubscriber("Third Subscriber");

        topic.register(firstObserver);
        topic.register(secondObserver);
        topic.register(thirdObserver);

        firstObserver.setSubject(topic);
        secondObserver.setSubject(topic);
        thirdObserver.setSubject(topic);

        firstObserver.update();
        topic.postMessage("Hello, World!");
        topic.unregister(secondObserver);

        out.println("======================================================================");
        thirdObserver.update();
        out.println("Get update: " + topic.getUpdate(secondObserver));
    }
}
