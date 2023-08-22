package org.strategy;

public class ChildStrategyImplTwo implements ParentInterface{

    public void performTask(String s) {
        System.out.println("Child Strategy Impl Two :"+s);
    }
}
