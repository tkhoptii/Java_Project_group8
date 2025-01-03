package tanya;

public class Week4_ReverseNegative_TK {

    public static int reverseNegative(int number) {
        if (number >= 0) {
            throw new IllegalArgumentException("Input must be a negative number.");
        }

        // Convert the number to positive, reverse it, and then negate it again
        int reversed = 0;
        number = Math.abs(number);

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return -reversed;
    }

    public static void main(String[] args) {
        int number = -12345;
        System.out.println("Reversed: " + reverseNegative(number)); // Output: -54321
    }

}


/*2. Numbers -- Reverse negative number
Write a return method that can reverse
negative number and return it as int */