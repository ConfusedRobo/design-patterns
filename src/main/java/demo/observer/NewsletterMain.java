package demo.observer;

import observer.newsletter.models.CatsTopic;
import observer.newsletter.models.NewsletterSubscriber;

import static java.lang.System.out;

public class NewsletterMain {

    public static void main(String... args) {
        var topic = new CatsTopic();
        var firstSubscriber = new NewsletterSubscriber("First Subscriber");
        var secondSubscriber = new NewsletterSubscriber("Second Subscriber");
        var thirdSubscriber = new NewsletterSubscriber("Third Subscriber");

        firstSubscriber.subscribeTo(topic);
        secondSubscriber.subscribeTo(topic);
        thirdSubscriber.subscribeTo(topic);

        topic.register(firstSubscriber);
        topic.register(secondSubscriber);
        topic.register(thirdSubscriber);

        topic.postMessage("Hello, World!");
        firstSubscriber.update();
        topic.unregister(secondSubscriber);

        out.println("======================================================================");
        thirdSubscriber.update();
    }
}
