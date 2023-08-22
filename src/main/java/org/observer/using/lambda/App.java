package org.observer.using.lambda;

public class App {
    public static void main(String[] args) {
        Subject subject=new SubjectImpl();
        subject.registerObservers((String s)->{
            System.out.println("Observer one got notified:"+s);
        });
        subject.registerObservers((String s)->{
            System.out.println("Observer two got notified:"+s);
        });
        subject.registerObservers((String s)->{
            System.out.println("Observer three got notified:"+s);
        });

        subject.notifyObservers("information");
    }
}
