package com.kataclub.chain;

import java.text.Normalizer;
import java.util.function.Function;

public class RemoveAccentFunction implements Function<String, String> {

    @Override
    public String apply(String input) {
        return separateAccentFromCharacters(input).replaceAll("[^\\p{ASCII}]", "");
    }

    private String separateAccentFromCharacters(String inputStringToClean) {
        return Normalizer.normalize(inputStringToClean, Normalizer.Form.NFD);
    }
}
