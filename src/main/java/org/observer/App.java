package org.observer;

public class App {
    public static void main(String[] args) {
        Subject subject=new SubjectImpl();
        subject.registerObservers(new ObserverOne());
        subject.registerObservers(new ObserverTwo());
        subject.registerObservers(new ObserverThree());

        subject.notifyObservers("information");
    }
}
