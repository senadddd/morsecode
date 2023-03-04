package Inl2;


import java.util.HashMap;
public class inl2 {

    public static final HashMap<String, String> MORSE_TO_ENGLISH = new HashMap<>();
    public static final HashMap<String, String> ENGLISH_TO_MORSE = new HashMap<>();

    static {


        // Morse to English mapping
        MORSE_TO_ENGLISH.put(".-", "A");
        MORSE_TO_ENGLISH.put("-...", "B");
        MORSE_TO_ENGLISH.put("-.-.", "C");
        MORSE_TO_ENGLISH.put("-..", "D");
        MORSE_TO_ENGLISH.put(".", "E");
        MORSE_TO_ENGLISH.put("..-.", "F");
        MORSE_TO_ENGLISH.put("--.", "G");
        MORSE_TO_ENGLISH.put("....", "H");
        MORSE_TO_ENGLISH.put("..", "I");
        MORSE_TO_ENGLISH.put(".---", "J");
        MORSE_TO_ENGLISH.put("-.-", "K");
        MORSE_TO_ENGLISH.put(".-..", "L");
        MORSE_TO_ENGLISH.put("--", "M");
        MORSE_TO_ENGLISH.put("-.", "N");
        MORSE_TO_ENGLISH.put("---", "O");
        MORSE_TO_ENGLISH.put(".--.", "P");
        MORSE_TO_ENGLISH.put("--.-", "Q");
        MORSE_TO_ENGLISH.put(".-.", "R");
        MORSE_TO_ENGLISH.put("...", "S");
        MORSE_TO_ENGLISH.put("-", "T");
        MORSE_TO_ENGLISH.put("..-", "U");
        MORSE_TO_ENGLISH.put("...-", "V");
        MORSE_TO_ENGLISH.put(".--", "W");
        MORSE_TO_ENGLISH.put("-..-", "X");
        MORSE_TO_ENGLISH.put("-.--", "Y");
        MORSE_TO_ENGLISH.put("--..", "Z");
        MORSE_TO_ENGLISH.put("/", " ");

        // English to Morse mapping
        ENGLISH_TO_MORSE.put("A", ".-");
        ENGLISH_TO_MORSE.put("B", "-...");
        ENGLISH_TO_MORSE.put("C", "-.-.");
        ENGLISH_TO_MORSE.put("D", "-..");
        ENGLISH_TO_MORSE.put("E", ".");
        ENGLISH_TO_MORSE.put("F", "..-.");
        ENGLISH_TO_MORSE.put("G", "--.");
        ENGLISH_TO_MORSE.put("H", "....");
        ENGLISH_TO_MORSE.put("I", "..");
        ENGLISH_TO_MORSE.put("J", ".---");
        ENGLISH_TO_MORSE.put("K", "-.-");
        ENGLISH_TO_MORSE.put("L", ".-..");
        ENGLISH_TO_MORSE.put("M", "--");
        ENGLISH_TO_MORSE.put("N", "-.");
        ENGLISH_TO_MORSE.put("O", "---");
        ENGLISH_TO_MORSE.put("P", ".--.");
        ENGLISH_TO_MORSE.put("Q", "--.-");
        ENGLISH_TO_MORSE.put("R", ".-.");
        ENGLISH_TO_MORSE.put("S", "...");
        ENGLISH_TO_MORSE.put("T", "-");
        ENGLISH_TO_MORSE.put("U", "..-");
        ENGLISH_TO_MORSE.put("V", "...-");
        ENGLISH_TO_MORSE.put("W", ".--");
        ENGLISH_TO_MORSE.put("X", "-..-");
        ENGLISH_TO_MORSE.put("Y", "-.--");
        ENGLISH_TO_MORSE.put("Z", "--..");
        ENGLISH_TO_MORSE.put(" ", "/");  // space to slash mapping
    }




}







