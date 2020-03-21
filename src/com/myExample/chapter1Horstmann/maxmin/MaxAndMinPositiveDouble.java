package com.myExample.chapter1Horstmann.maxMinDouble;

import static java.lang.Math.nextUp;

public class MaxAndMinPositiveDouble {
    /*    4. Write a program that prints the smallest and largest positive double values.
        Hint: Look up Math.nextUp in the Java API.*/

    public  void maxAndMinPozitiveDouble() {
        double largest = Double.MAX_VALUE;
        double smallest = Double.MIN_VALUE;
        System.out.println(largest + "  " + smallest);
        System.out.println(nextUp(largest));
        System.out.println(nextUp(smallest));
    }
}
