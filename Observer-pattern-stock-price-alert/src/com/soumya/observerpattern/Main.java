/* The Observer Design Pattern is a behavioral design pattern used when one object (subject) needs to notify multiple
other objects (observers) automatically whenever its state changes.

It defines a one-to-many dependency:
One Subject (Publisher)
Many Observers (Subscribers)
When the subject updates, all observers are notified.

👉 Real-life example:
Think of a YouTube channel — when a creator uploads a video, all subscribers get notified.
 */

package com.soumya.observerpattern;

import com.soumya.observerpattern.model.User;
import com.soumya.observerpattern.service.StockService;
import com.soumya.observerpattern.service.SubscriptionService;
import com.soumya.observerpattern.strategy.Email;
import com.soumya.observerpattern.strategy.Push;
import com.soumya.observerpattern.strategy.SMS;
import com.soumya.observerpattern.subject.Stock;

public class Main {
    public static void main(String[] args) {

        System.out.println("Observer Pattern");

        StockService stockService = new StockService();
        SubscriptionService subscriptionService = new SubscriptionService();

        Stock tcs = new Stock("TCS");
        Stock infy = new Stock("INFOSYS");

        stockService.addStock(tcs);
        stockService.addStock(infy);

        User u1 = new User("Alice");
        User u2 = new User("Bob");

        u1.addStrategy(new Email());
        u1.addStrategy(new Push());

        u2.addStrategy(new Push());
        u2.addStrategy(new SMS());

        subscriptionService.subscribe(u1,tcs);
        subscriptionService.subscribe(u2,infy);

        stockService.updatePrice("TCS",5000);
        stockService.updatePrice("INFOSYS",2500);

    }
}