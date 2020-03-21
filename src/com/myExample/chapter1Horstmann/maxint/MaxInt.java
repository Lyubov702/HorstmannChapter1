package com.myExample.fundamentalProgrammingStructures.maxInt;

public class MaxInt {
/*    5. What happens when you cast a double to an int
    that is larger than the largest possible int value? Try it out.*/

    public void maxInt() {
        double num1 = 3.0E+21;
        System.out.println(num1);
        int int1 = (int) num1;
        System.out.println(int1); //2147483647 maxInt
    }
}
