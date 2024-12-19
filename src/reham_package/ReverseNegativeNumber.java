package reham_package;

public class ReverseNegativeNumber {

    public static void main(String[] args) {
        reverseNumber(-12345);
    }



    public static void reverseNumber(int number) {

        int reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;

        }
        System.out.println(reversed);

    }





}
