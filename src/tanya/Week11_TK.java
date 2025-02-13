package tanya;

import java.util.Arrays;

public class Week11_TK {
    /*Write a method that can move all the zeros to  last indexes of the array
            (Do Not Use Sort Method)
       Ex:
       input:  {1,0,2,0,3,0,4,0};
       output: [1, 2, 3, 4, 0, 0, 0, 0]
       */
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0};
        System.out.println(Arrays.toString(moveZerosToEnd(arr)));
    }

        public static int[] moveZerosToEnd(int[] arr) {
            int[] result = new int[arr.length];
            int index = 0;

            for (int num : arr) {
                if (num != 0) {
                    result[index++] = num;
                }
            }
            return result;
        }
    }

