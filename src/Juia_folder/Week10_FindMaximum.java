package Juia_folder;
//Write a method that can find the maximum number from an int Array

public class Week10_FindMaximum {

   

    // Method to find the maximum number in an integer array
    public static int findMax(int[] numbers) {
        // Assume the first element is the maximum
        int max = numbers[0];

        // Use a for-each loop for simplicity to iterate through each number
        for (int number : numbers) {
            // Update max if the current number is greater than the current max
            if (number > max) {
                max = number;
            }
        }
        // Return the maximum number found in the array
        return max;
    }

    public static void main(String[] args) {
        // Example array of integers
        int[] array = {3, 5, 7, 2, 8, -1, 4, 10, 12};

        // Print the maximum number from the array
        System.out.println("The maximum number is: " + findMax(array));
    }
}


// public static int findMax(int[] numbers) {
//         if (numbers == null || numbers.length == 0) {
//             throw new IllegalArgumentException("Array is null or empty");
//         }
//
//         int max = numbers[0]; // Assume the first element is the maximum
//
//         for (int i = 1; i < numbers.length; i++) {
//             if (numbers[i] > max) {
//                 max = numbers[i]; // Update max if the current element is greater
//             }
//         }
//
//         return max;
//     }
//
//     public static void main(String[] args) {
//         int[] array = {3, 5, 7, 2, 8, -1, 4, 10, 12};
//         System.out.println("The maximum number is: " + findMax(array));
//     }
// }

