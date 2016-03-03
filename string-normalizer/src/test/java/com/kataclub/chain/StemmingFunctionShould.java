package com.kataclub.chain;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StemmingFunctionShould {

    @Test
    public void shouldNormalizeStringToHisStemmingForm(){

        String expectedOutput = "the dev stream rock";
        String input1 = "the dev stream rocked";
        String input2 = "the dev stream rocking";

        StemmingFunction stemmingFunction = new StemmingFunction();
        String actualOutput1 = stemmingFunction.apply(input1);
        assertThat(actualOutput1, is(expectedOutput));
        String actualOutput2 = stemmingFunction.apply(input2);
        assertThat(actualOutput2, is(expectedOutput));
    }
}