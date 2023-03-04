package Inl2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TestJava {


    @Test

    public void TestEnglishToMorse() {
        ConvertMorse converter = new ConvertMorse();
        String testdata = "A";

        String actual = converter.EnglishToMorse(testdata);
        String expected = ".-";


        assertEquals(expected, actual);
    }

    @Test

    public void TestMorseToEnglish() {
        ConvertMorse converter = new ConvertMorse();
        String testdata = ".-";

        String actual = converter.MorseToEnglish(testdata);
        String expected = "A";


        assertEquals(expected, actual);
    }




    @Test
    public void testMorseToEnglishSplit() {
        ConvertMorse converter = new ConvertMorse();

        String testdata = ("/");

        String actual = converter.MorseToEnglishSplit(testdata);
        String expected  = " ";
        assertEquals(expected, actual);
    }

    @Test
    public void TestLongWordsMorseToEnglish() {
        ConvertMorse converter = new ConvertMorse();

        String test = (".... . .-.. .-.. --- / .-- --- .-. .-.. -..");
        String actual = converter.LongWordsMorseToEnglish(test);
        String expected = ("HELLO WORLD");


        assertEquals(expected,actual);
    }
    @Test

    public  void TestAnimalsEnglishToMorse() {
        ConvertMorse converter = new ConvertMorse();

        String animals = ("LION LION");

        String actual = converter.AnimalsEnglishToMorse(animals);
        String expected = (".-.. .. --- -. / .-.. .. --- -.");


        assertEquals(expected,actual);
    }
}







