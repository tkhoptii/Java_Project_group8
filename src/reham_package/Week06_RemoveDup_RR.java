package reham_package;

public class Week06_RemoveDup_RR {


    public static void main(String[] args) {

        System.out.println(removeDup("AAABBBCCC"));

        System.out.println(removeDup("XXXXYYYYYZZZZZ"));




    }




    public static String removeDup(String str) {

        StringBuilder result = new StringBuilder();

        for (int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            if (result.indexOf(String.valueOf(ch)) == -1){
                result.append(ch);
            }
        }

        return result.toString();



    }





}
