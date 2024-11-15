package reham_package;

/*
Numbers  ---Odd & Even
write a method which can identifies given number is even or odd


        EX:
             identify(5) -> "Odd"
             identify(6) -> "Even"
*/

public class Week1_OddorEven_TK {

    public static void main(String[] args) {
        System.out.println(Numbers(5));
        System.out.println(Numbers(10));
        System.out.println(Numbers(25));
        System.out.println(Numbers(15));
    }


    public static String Numbers(int nums) {
       return nums %2 == 0 ? "Even" : "odd";
    }




}
