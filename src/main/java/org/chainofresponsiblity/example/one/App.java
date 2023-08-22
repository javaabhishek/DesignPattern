package org.chainofresponsiblity.example.one;

public class App {
    public static void main(String[] args) {
        ProcessingObject<String> p1=new HeaderTextProcessing();
        ProcessingObject<String> p2=new SpellCheckerTextProcessing();

        p1.setProcessingObject(p2);

       String s= p1.handle("Text processor");
        System.out.println("Result:"+s);
    }
}
