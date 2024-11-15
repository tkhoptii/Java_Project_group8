package iliyana;

public class Week1_OddOrEven_IK {


    public static void main(String[] args) {

        System.out.println(Find(1));
        System.out.println(Find(10));
        System.out.println(Find(110));
        System.out.println(Find(40));
        System.out.println(Find(9));
        System.out.println(Find(55));
    }

    public static String Find (int num){

        if(num % 2 == 0 ){
            return "Even";
        }else {
            return "Odd";


        }

    }


}
/*

Numbers  ---Odd & Even

write a method which can identify given number is even or odd


        EX:
             identify(5) -> "Odd"
             identify(6) -> "Even"

*/