package Juia_folder;

/*
Numbers  ---Odd & Even
write a method which can identifies given number is even or odd

        EX:
             identify(5) -> "Odd"
             identify(6) -> "Even"
*/


public class Week1_OddorEven {


public static void main(String[] args) {
    System.out.println(identify(45));
    System.out.println(identify(66));

}
public static String identify (int num){
    if (num % 2 == 0) {
        return "Even";
    } else{
        return "Odd";
    }
}

}
