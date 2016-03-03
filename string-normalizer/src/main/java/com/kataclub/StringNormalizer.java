package com.kataclub;

import com.kataclub.chain.RemoveAccentFunction;
import com.kataclub.chain.RemovePunctuationFunction;
import com.kataclub.chain.SentenceFormalizeFunction;
import com.kataclub.chain.StemmingFunction;

import java.util.function.Function;

public class StringNormalizer {

    public String cleanString(String input) {

        RemoveAccentFunction removeAccent = new RemoveAccentFunction();
        RemovePunctuationFunction removePunctuation = new RemovePunctuationFunction();
        StemmingFunction stemWords = new StemmingFunction();
        SentenceFormalizeFunction formalizeSentence = new SentenceFormalizeFunction();
        Function<String, String> stringNormalizerChain = removeAccent
                .andThen(removePunctuation)
                .andThen(stemWords)
                .andThen(formalizeSentence);
        return stringNormalizerChain.apply(input);
    }

}
