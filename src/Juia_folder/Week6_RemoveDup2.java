package Juia_folder;

public class Week6_RemoveDup2 {

        public static void main(String[] args) {
            String input = "AAABBBCCC";
            String result = removeDup(input);
            System.out.println(result);
           // System.out.println(removeDup(input));
        }

        public static String removeDup(String str) {
            String result = "";

            for (char each: str.toCharArray()) {
                if (!result.contains(String.valueOf(each))) {
                    result += each;
                }
            }

            return result;
        }
    }

