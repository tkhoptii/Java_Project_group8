package tanya;

public class Week10_FindMaximum_TK {

    public static void main(String[] args) {
        int[] nums = {3, 6, 99, 1, 39, 6 ,45};
        System.out.println("Maximum number = " + findMax(nums));
    }


    public static int findMax(int[] numbers) {
        int max = numbers[0]; //  the first element is the max
        for (int each : numbers) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }
}
//Write a method that can find the maximum number from an int Array