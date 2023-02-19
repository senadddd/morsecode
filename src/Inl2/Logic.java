package Inl2;

import java.util.Scanner;

import static Inl2.inl2.ENGLISH_TO_MORSE;
import static Inl2.inl2.MORSE_TO_ENGLISH;


public class Logic {
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
    public static boolean isMorseCode(String input) {
        return input.contains(".") || input.contains("-");
    }

    public static String translateMorseToEnglish(String input) {
        StringBuilder sb = new StringBuilder();
        String[] words = input.split(" / ");
        for (String word : words) {
            String[] letters = word.split(" ");
            for (String letter : letters) {
                sb.append(MORSE_TO_ENGLISH.get(letter));
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
    public static String translateEnglishToMorse(String input) {
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            sb.append(ENGLISH_TO_MORSE.get(Character.toString(c))).append(" ");
        }
        return sb.toString().trim();
    }
}