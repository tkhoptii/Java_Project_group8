package Juia_folder;
/*
Numbers – Swap Numbers
Swap two variables' values without using a third variable.

*/

public class Week3_SwapNumbers {
    public static void main(String[] args) {

        int x = 10;
        int y = 15;
        System.out.println("Before Swap : x = " + x + ": y = " + y);
        x = x + y;//10+15 = 25
        y = x - y;//25-15 = 10
        x = x - y;//25 - 10 = 15
        System.out.println("After Swap :  x = " + x + ": y = " + y  );
    }
}
