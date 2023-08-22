package org.chainofresponsiblity.example.two;

public abstract class AuthenticationProcessor {
    protected AuthenticationProcessor processor;

    public AuthenticationProcessor(AuthenticationProcessor processor) {
        this.processor = processor;
    }

    abstract void isValidUser(String username);
}
