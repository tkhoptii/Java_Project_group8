package tanya;

public class Week5_FrequencyOfCharacters {

    public static void main(String[] args) {
        String input = "AAABBCDD";
        System.out.println("Frequency of characters: " + findFrequencyOfChars(input));
    }


    public static String findFrequencyOfChars(String str) {

        StringBuilder result = new StringBuilder();
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char currentChar = chars[i];
            int count = 0;
            if (result.toString().contains(String.valueOf(currentChar))) {
                continue;
            }

            for (char each : chars) {
                if (currentChar == each) {
                    count++;
                }
            }
            result.append(currentChar).append(count);
        }
        return result.toString();
    }
}


// Write a return method that can find the frequency of characters
//  Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2