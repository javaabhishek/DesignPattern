package org.chainofresponsiblity.example.one;

public class SpellCheckerTextProcessing extends ProcessingObject<String>{

    @Override
    protected String handleWork(String input) {
        return "\n Spell checker Text processing:"+input;
    }
}
