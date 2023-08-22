package org.chainofresponsiblity.example.one;

public class HeaderTextProcessing extends ProcessingObject<String>{

    @Override
    protected String handleWork(String input) {
        return "\n Header Text processing:"+input+" Header text processing modified the input";
    }
}
