package com.kataclub.chain;

import org.tartarus.snowball.ext.PorterStemmer;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StemmingFunction implements Function<String, String> {

    @Override public String apply(String input) {
        return Stream.of(input.split(" "))
                .map(word -> stemWord(word))
                .collect(Collectors.joining(" "));

    }

    private String stemWord(String word) {
        PorterStemmer stem = new PorterStemmer();
        stem.setCurrent(word);
        stem.stem();
        return stem.getCurrent();
    }

}
