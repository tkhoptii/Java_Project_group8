package tanya;

import java.util.Arrays;

public class Week12_ArraySortAscending_TK {

    /*Write a return method that can sort an int array in Ascending order
 without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};*/

    public static int[] sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) { // Outer loop: controls passes
            for (int j = 0; j < n - i - 1; j++) { // Inner loop: compares adjacent elements
                if (arr[j] > arr[j + 1]) { // Swap if out of order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        System.out.println(Arrays.toString(sort(arr))); // Output: [7, 8, 9, 10]
    }
}
