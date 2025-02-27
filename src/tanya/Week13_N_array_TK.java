package tanya;

import java.util.Arrays;

public class Week13_N_array_TK {

//    Write a function that given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
//    The function can return any such array.
//    For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
//    The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
//    For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).*/


    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(6)));
        System.out.println(Arrays.toString(sumZero(3)));
    }

        public static int[] sumZero(int N) {
            int[] result = new int[N];
            for (int i = 0; i < N; i++) {
                result[i] = i * 2 - N + 1;
            }
            return result;
        }
    }





//    public static int[] sumZero(int N) {
//        int[] result = new int[N];
//        int num = 1;
//
//        for (int i = 0; i < N / 2; i++) {
//            result[i] = num;
//            result[N - 1 - i] = -num;
//            num++;
//        }
//
//        if (N % 2 != 0) {
//            result[N / 2] = 0; // Add zero for odd N
//        }
//        return result;
//    }



