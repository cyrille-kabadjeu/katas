package com.kataclub.chain;

import java.util.function.Function;

public class RemovePunctuationFunction implements Function<String, String> {

    @Override
    public String apply(String input) {
        return input.replaceAll("\\p{Punct}", "");
    }
}
