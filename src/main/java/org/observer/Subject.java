package org.observer;

public interface Subject {
    void registerObservers(Observer observer);
    void notifyObservers(String info);
}
