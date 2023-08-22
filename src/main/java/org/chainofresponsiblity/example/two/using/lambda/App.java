package org.chainofresponsiblity.example.two.using.lambda;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class App {
    public static void main(String[] args) {
        UnaryOperator<String> oauthProc=(String s)->{
          if (s.equals("oauth")){
              System.out.println("Yes valid user, oauth");
          }
          return s;
        };

        UnaryOperator<String> inCacheProc=(String s)->{
            if (s.equals("cache")){
                System.out.println("Yes valid user, cache");
            }
            return s;
        };

        UnaryOperator<String> samlProc=(String s)->{
            if (s.equals("saml")){
                System.out.println("Yes valid user, saml");
            }
            return s;
        };

        Function<String,String> pipleline=oauthProc.andThen(inCacheProc.andThen(samlProc));
        pipleline.apply("cache");
    }
}
