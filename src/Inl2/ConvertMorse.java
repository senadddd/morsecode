package Inl2;

import java.util.Scanner;

import static Inl2.inl2.*;

public class ConvertMorse {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the text to translate (Morse or English):");
        String input = scanner.nextLine().toUpperCase();

        String output = "";
        if (isMorseCode(input)) {
            output = translateMorseToEnglish(input);
        } else {
            output = translateEnglishToMorse(input);
        }

        System.out.println(output);
        scanner.close();

    }


    public String MorseToEnglish(String testdata) {
        return MORSE_TO_ENGLISH.get(testdata);
    }

    public String MorseToEnglishSplit(String testdata) {
        return  MORSE_TO_ENGLISH.get(testdata);
    }

    public String LongWordsMorseToEnglish(String test) {
        return translateMorseToEnglish(test);
    }

    public String AnimalsEnglishToMorse(String animals) {
        return translateEnglishToMorse(animals);
    }
}


