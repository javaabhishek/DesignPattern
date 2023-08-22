package org.observer;

public class ObserverTwo implements Observer{

    @Override
    public void notify(String info) {
        System.out.println("Observer two is notified");
    }
}