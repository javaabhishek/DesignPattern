package org.chainofresponsiblity.example.two;

public class InCacheAuthenticationProcessor extends AuthenticationProcessor{

    public InCacheAuthenticationProcessor(AuthenticationProcessor processor) {
        super(processor);
    }

    @Override
    void isValidUser(String username) {
        if(username.equals("cache")){
            System.out.println("Yes, it is valid user: cache");
        }else if(super.processor!=null){
            super.processor.isValidUser(username);
        }
    }
}
