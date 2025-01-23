package tanya;

import java.util.HashSet;
import java.util.Set;

public class FindUnique_2_TK {

    public static void main(String[] args) {

        String original = "AAABBBCCCDEF";

        Set<Character> uniqueChars = new HashSet<>();
        //char[] charArray = original.toCharArray();

        for (char ch : original.toCharArray()) {
            if (ch != ' ') {
                uniqueChars.add(ch);
            }

        }

        System.out.println("Unique characters: " + uniqueChars);
    }
}
//String -- Find the unique
//Write a return method that can find the unique characters from the String
//Ex: unique("AAABBBCCCDEF") ==> "DEF";
