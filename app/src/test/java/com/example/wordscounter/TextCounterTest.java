package com.example.wordscounter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TextCounterTest {
    @Test
    public void StringIsEmpty_ReturnsZero(){
        final String givenString = "";

        final int expectedResult = 0;
        final int actualResult = TextCounter.countWords(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void StringForWordsWithText_ReturnsNumberOfWords(){
        final String givenString = "asc ass as saa ";

        final int expectedResult = 4;
        final int actualResult = TextCounter.countWords(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void StringForWordsWithNumbers_ReturnsMinusOne(){
        final String givenString = "324 234 21 1";

        final int expectedResult = -1;
        final int actualResult = TextCounter.countWords(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void StringForChars_ReturnsNumberOfChars(){
        final String givenString = "a d fsa s3 5 ?";

        final int expectedResult = 9;
        final int actualResult = TextCounter.countChars(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void StringForWordsWithNumbersAndText_ReturnsNumberOfWords(){
        final String givenString = "qwe 213 444 343 ad";

        final int expectedResult = 2;
        final int actualResult = TextCounter.countWords(givenString);

        assertEquals(expectedResult, actualResult);
    }
}