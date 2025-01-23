package tanya;

public class FindTheUnique_TK {

    public static void main(String[] args) {
        String original = "AAABBBCCCDEF";
        String uniqueResult = findUnique(original);
        System.out.println("Original: " + original);
        System.out.println("Unique characters: " + uniqueResult);
    }

    public static String findUnique(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            //AAABBBCCCDEF
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                result.append(ch);
            }
        }
        return result.toString();
    }
}