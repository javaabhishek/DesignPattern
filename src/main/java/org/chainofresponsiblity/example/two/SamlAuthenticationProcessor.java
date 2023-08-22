package org.chainofresponsiblity.example.two;

public class SamlAuthenticationProcessor extends AuthenticationProcessor{

    public SamlAuthenticationProcessor(AuthenticationProcessor processor) {
        super(processor);
    }

    @Override
    void isValidUser(String username) {
        if(username.equals("saml")){
            System.out.println("Yes, it is valid user: saml");
        }else{
            if(super.processor!=null){
                super.processor.isValidUser(username);
            }
        }
    }
}
