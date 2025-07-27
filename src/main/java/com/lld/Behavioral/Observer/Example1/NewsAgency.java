package com.lld.Behavioral.Observer.Example1;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private List<Observer> subscribers = new ArrayList<>();

    public void subscribe(Observer o) {
        subscribers.add(o);
    }

    public void unsubscribe(Observer o) {
        subscribers.remove(o);
    }

    public void publishNews(String news) {
        for (Observer o : subscribers) {
            o.update(news);
        }
    }
}
