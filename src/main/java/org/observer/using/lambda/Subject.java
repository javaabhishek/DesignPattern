package org.observer.using.lambda;

import java.util.function.Consumer;

public interface Subject {
    void registerObservers(Observer observer);
    void notifyObservers(String info);
}
