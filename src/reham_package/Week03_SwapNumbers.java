package reham_package;

public class Week03_SwapNumbers {

    public static void main(String[] args) {

        int x = 9;
        int y = 7;

        System.out.println("Before Swap : x = " + x + ": y = " + y);

        x = x + y; // 9 + 7 -> 16
        y = x - y; // 16 - 7 -> 9
        x = x - y; // 16 - 9 -> 7

        System.out.println("After Swap :  x = " + x + ": y = " + y  );


    }


}
