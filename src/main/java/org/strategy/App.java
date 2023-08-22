package org.strategy;

public class App {

    private final ParentInterface parentInterface;

    public App(ParentInterface parentInterface) {
        this.parentInterface = parentInterface;
    }

    public void executeStrategy(String givenString){
        this.parentInterface.performTask(givenString);
    }
    public static void main(String[] args) {
        App app=new App(new ChildStrategyImplOne());
        app.executeStrategy("Strategy one");

        App app1=new App(new ChildStrategyImplTwo());
        app1.executeStrategy("Strategy two");
    }
}
