import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SortCharacter {

    public static String procVowel(String param) {
        String vowelChars = "";
        String lowerParam = param.replaceAll("\\s", "").toLowerCase();
        String vowels = "aeiou";
        Map<Character, Integer> vowelCount = new HashMap<>();
        for (char c : lowerParam.toCharArray()) {
            if (vowels.contains(String.valueOf(c))) {
                vowelCount.put(c, vowelCount.getOrDefault(c, 0) + 1);
            }
        }
        for (char c : vowels.toCharArray()) {
            if (vowelCount.containsKey(c) && vowelCount.get(c) > 0) {
                vowelChars += new String(new char[vowelCount.get(c)]).replace('\0', c);
                vowelCount.put(c, 0);
            }
        }
        return vowelChars;
    }

    public static String procConsonant(String param) {
        StringBuilder consonantChars = new StringBuilder();
        String lowerParam = param.toLowerCase();
        String vowels = "aeiou";

        for (char c : lowerParam.toCharArray()) {
            if ("bcdfghjklmnpqrstvwxyz".contains(String.valueOf(c)) && !vowels.contains(String.valueOf(c))) {
                if (consonantChars.indexOf(String.valueOf(c)) == -1) {
                    consonantChars.append(c);
                }
            }
        }
        return consonantChars.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input one line of words (S) : ");
        String input = scanner.nextLine();

        String charVowel = procVowel(input);
        String charConsonant = procConsonant(input);

        System.out.println("Vowel Characters:");
        System.out.println(charVowel);
        System.out.println("Consonant Characters:");
        System.out.println(charConsonant);

        scanner.close();
    }
}
