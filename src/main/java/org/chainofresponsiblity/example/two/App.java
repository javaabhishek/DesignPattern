package org.chainofresponsiblity.example.two;

public class App {
    public static void main(String[] args) {
        AuthenticationProcessor processor=new OAuthAuthenticationProcessor(
                new InCacheAuthenticationProcessor(
                new SamlAuthenticationProcessor(null)
        ));
        processor.isValidUser("oauth");
    }
}
