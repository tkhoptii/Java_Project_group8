package tanya;


/*
Numbers  ---Odd & Even
write a method which can identifies given number is even or odd


        EX:
             identify(5) -> "Odd"
             identify(6) -> "Even"
*/

public class Week1_OddOrEven_TK {

    public static void main(String[] args) {

        System.out.println(identify(5));
        System.out.println(identify(6));
        System.out.println(identify(99));
        System.out.println(identify(110));

    }

    public static String identify(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
