package reactive.reactivestreams.pubsub;

import java.util.concurrent.Flow;

public class PubSubMain {
    public static void main(String[] args) throws InterruptedException {
        Flow.Publisher publisher = new FixedIntPublisher();
        Flow.Subscriber subscriber = new RequestNSubscriber <>(1);
//        Flow.Subscriber subscriber = new RequestNSubscriber <>(3);
//        Flow.Subscriber subscriber = new RequestNSubscriber <>(Integer.MAX_VALUE);
        publisher.subscribe(subscriber);
        Thread.sleep(100);
    }
}
