package org.observer;

public class ObserverThree implements Observer{

    @Override
    public void notify(String info) {
        System.out.println("Observer three is notified");
    }
}