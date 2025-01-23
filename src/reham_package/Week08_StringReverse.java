package reham_package;

public class Week08_StringReverse {
    public static void main(String[] args) {

        System.out.println(reverseString("Hello"));
        System.out.println(reverseString("ABCD"));
        System.out.println(reverseString("QA ENGINNER"));

    }


    public static String reverseString(String str) {

        String reverse = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            reverse += str.charAt(i);




        }
        return reverse;


    }


}
