package com.kataclub.chain;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RemovePunctuationFunctionShould {

    @Test
    public void shouldRemovePunctuationMarksFromStringInput(){

        String expectedOutput = "The dev Stream…… ™Rocks";
        String input = "The dev, Stream…… ™Rocks!?!";
        RemovePunctuationFunction removePunctuationFunction = new RemovePunctuationFunction();
        String actualOutput = removePunctuationFunction.apply(input);
        assertThat(actualOutput, is(expectedOutput));
    }


}