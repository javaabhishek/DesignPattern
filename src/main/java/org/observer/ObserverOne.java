package org.observer;

public class ObserverOne implements Observer{

    @Override
    public void notify(String info) {
        System.out.println("Observer One is notified");
    }
}
