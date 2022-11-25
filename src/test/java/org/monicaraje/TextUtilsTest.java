package org.monicaraje;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextUtilsTest {

    //Null input value
    @Test
    void getLongestWord() {
        //fail("Test not implemented yet");
        final String input = "Hello welcome to Junit Test method";
        final String expected = "welcome";
        final String observed = TextUtils.getLongestWord(input);
        assertEquals(expected,observed);
    }
}