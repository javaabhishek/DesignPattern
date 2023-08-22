package org.observer.using.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class SubjectImpl implements Subject {
    List<Observer> observerList=new ArrayList<>();
    @Override
    public void registerObservers(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void notifyObservers(String info) {
        observerList.stream().forEach(observer -> observer.notify(info));
    }
}
