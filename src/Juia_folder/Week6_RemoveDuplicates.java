package Juia_folder;
public class Week6_RemoveDuplicates {
    public static void main(String[] args) {
        String input = "AAABBBCCC";
        String result = removeDup(input);
        System.out.println(result); // Вывод: ABC
    }

    public static String removeDup(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                result.append(currentChar);
            }
        }

        return result.toString();
    }

}