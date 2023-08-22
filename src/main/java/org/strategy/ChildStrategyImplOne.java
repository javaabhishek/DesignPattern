package org.strategy;

public class ChildStrategyImplOne implements ParentInterface{

    public void performTask(String s) {
        System.out.println("Child Strategy Impl One :"+s);
    }
}
