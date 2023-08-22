package org.template;

public class App {
    public static void main(String[] args) {
        OnlineBanking onlineBanking=new KolhapurBranch();
        onlineBanking.processCustomer(1);

        onlineBanking=new PuneBranch();
        onlineBanking.processCustomer(1);

    }
}
