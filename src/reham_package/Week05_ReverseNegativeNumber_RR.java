package reham_package;

public class Week05_ReverseNegativeNumber_RR {

    public static void main(String[] args) {
        reverseNumber(-987);
    }



    public static void reverseNumber(int number) {

        int reversed = 0;

        while (number != 0) {
//        Last digit: 12345 % 10 = 5.
//        reversed = 0 * 10 + 5 = 5.
            reversed = reversed * 10 + number % 10;
//        number = 12345 / 10 = 1234.
            number /= 10;

        }
        System.out.println(reversed);

    }




}
