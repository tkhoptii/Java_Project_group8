package tanya;

public class Week6_RemoveDuplicates_TK {

    public static void main(String[] args) {
        String original = "AAABBBCCC";
        String result = removeDuplicates(original);
        System.out.println("original = " + original);
        System.out.println("output = " + result);
    }


    public static String removeDuplicates(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(result.indexOf(ch)==-1){
                result += ch;
            }
        }
        return result;
    }
}
