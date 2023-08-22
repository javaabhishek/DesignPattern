package org.template;

public abstract class OnlineBanking {
    public void processCustomer(int id){
        //fetch customer
        System.out.println("ID "+id+" customer is fetched from DB");
        //perform core task
        System.out.println("Perform core processing task");
        branchLevelStuff(id);
    }

    public abstract void branchLevelStuff(int id);//sub-classes will have to provide additional stuff
}
