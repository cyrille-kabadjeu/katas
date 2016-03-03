package com.kataclub;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StringNormalizerShould {

    @Test
    public void shouldNormalizeStringWithAccent(){

        String expectedOutput = "the dev stream rock";
        String input = "ThÈ déV Stream ™Ròçks";
        StringNormalizer stringNormalizer = new StringNormalizer();
        String actualOutput = stringNormalizer.cleanString(input);
        assertThat(actualOutput, is(expectedOutput));
    }

    @Test
    public void shouldNormalizeStringWithPunctuation(){

        String expectedOutput = "the dev stream rock";
        String input = "The dev, Stream…… ™Rocks!?!";
        StringNormalizer stringNormalizer = new StringNormalizer();
        String actualOutput = stringNormalizer.cleanString(input);
        assertThat(actualOutput, is(expectedOutput));
    }

    @Test
    public void shouldNormalizeStringToHisStemmingForm(){

        String expectedOutput = "the dev stream rock";
        String input1 = "ThÈ déV, Stream…… ™Rocked!?!";
        String input2 = "ThÈ déV,,,,,, ......Stream ™Ròçking";
        StringNormalizer stringNormalizer = new StringNormalizer();
        String actualOutput1 = stringNormalizer.cleanString(input1);
        assertThat(actualOutput1, is(expectedOutput));
        String actualOutput2 = stringNormalizer.cleanString(input2);
        assertThat(actualOutput2, is(expectedOutput));
    }

}
