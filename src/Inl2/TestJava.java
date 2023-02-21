package Inl2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestJava {


    @Test
    public void testEnglishToMorse() {

        Logic translateEnglishToMorse = new Logic(); //skapa objekt

        String code = "A"; // testdata

        String actual = translateEnglishToMorse.becode(code); //skicka in testdata som ska hantera detta
        String expected = "-.";

        assertEquals(expected, actual);

    }


    @Test
    public void testMorseToEnglish() {

        Logic translateMorseToEnglish = new Logic(); //skapa objekt

        String code = "B"; // testdata

        String actual = translateMorseToEnglish.decode(code); //skicka in testdata som ska hantera detta
        String expected = "-...";

        assertEquals(expected, actual);
    }

    @Test
    public void testSplit() {

        Logic wordSplit = new Logic(); //skapa objekt

        String code = " "; // testdata

        String actual = wordSplit.secode(code); //skicka in testdata som ska hantera detta
        String expected = "/";

        assertEquals(expected, actual);
    }
}
