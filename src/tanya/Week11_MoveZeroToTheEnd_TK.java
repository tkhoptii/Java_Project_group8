package tanya;

import java.util.Arrays;

public class Week11_MoveZeroToTheEnd_TK {

    /*Write a method that can move all the zeros to  last indexes of the array
         (Do Not Use Sort Method)
    Ex:
    input:  {1,0,2,0,3,0,4,0};
    output: [1, 2, 3, 4, 0, 0, 0, 0]
    */
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0};
        moveZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZerosToEnd(int[] numsArr) {
        int index = 0;

        for (int eachNum : numsArr) {
            if (eachNum > 0) {
                numsArr[index++] = eachNum;
            }
        }

        while (index < numsArr.length) {
            numsArr[index++] = 0;
        }
    }
}
