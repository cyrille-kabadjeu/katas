package com.kataclub.chain;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RemoveAccentFunctionShould {

    @Test
    public void shouldRemoveAccentFromStringInput(){

        String expectedOutput = "ThE deV Stream Rocks";
        String input = "ThÈ déV Stream…… ™Ròçks";
        RemoveAccentFunction removeAccentFunction = new RemoveAccentFunction();
        String actualOutput = removeAccentFunction.apply(input);
        assertThat(actualOutput, is(expectedOutput));
    }

}