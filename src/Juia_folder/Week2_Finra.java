package Juia_folder;

import java.util.ArrayList;
import java.util.List;

public class Week2_Finra {/*
    QUESTION 2- Write a function which prints out the numbers from 1 to 30 but
    for numbers which are a multiple of 3, print "FIN" instead of the number
    and for numbers which are a multiple of 5, print "RA" instead of the number.
    for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
     */


    public static void main(String[] args) {


        List<String> list = new ArrayList<>();

        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FINRA");
            } else if (i % 3 == 0) {
                list.add("FIN");
            } else if (i % 5 == 0) {
                list.add("RA");
            } else {
                list.add(Integer.toString(i));
            }
        }

        System.out.println("list = " + list);

    }

}


