 package org.chainofresponsiblity.example.two;

public class OAuthAuthenticationProcessor extends AuthenticationProcessor{

    public OAuthAuthenticationProcessor(AuthenticationProcessor processor) {
        super(processor);
    }

    @Override
    void isValidUser(String username) {
        if(username.equals("oauth")){
            System.out.println("Yes, it is valid user: oauth");
        }else{
            if(super.processor!=null){
                super.processor.isValidUser(username);
            }
        }
    }
}
