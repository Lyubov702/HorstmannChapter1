package com.myExample.fundamentalProgrammingStructures.task5;

public class Main {
/*    5. What happens when you cast a double to an int
    that is larger than the largest possible int value? Try it out.*/

    public static void main(String[] args) {
        double num1 = 3.0E+21;
        System.out.println(num1);
        int int1 = (int) num1;
        System.out.println(int1); //2147483647 maxInt
    }
}
