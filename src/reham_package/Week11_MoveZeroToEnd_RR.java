package reham_package;

import java.util.Arrays;

public class Week11_MoveZeroToEnd_RR {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZero(1, 0, 2, 0, 3, 0, 4, 0)));
    }



    public static int[] moveZero(int ... nums){


        int[] move = new int[nums.length]; //[0, 0, 0, 0, 0, 0, 0, 0]
        int index = 0;

        for (int eachNum : nums) {
            if (eachNum != 0) {
                move[index++] = eachNum;
            }

        }

     return move;
    }





}
