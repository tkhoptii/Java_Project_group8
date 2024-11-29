package tanya;

public class Week3_SwapNumbers_TK {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        System.out.println("Before swapping a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping a = " + a + ", b = " + b);
    }
}
/*
Numbers – Swap Numbers
Swap two variables' values without using a third variable.

*/