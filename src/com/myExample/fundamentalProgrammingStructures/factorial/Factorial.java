package com.myExample.fundamentalProgrammingStructures.task6;

import java.math.BigInteger;

public class Main {
    /*    6. Write a program that computes the factorial n! = 1 × 2 × . . . × n,
      using BigInteger. Compute the factorial of 1000. */

    public static void main(String[] args) {
        int number = 1000;
        BigInteger result = factorial(number);
        System.out.println(result);
    }

    public static BigInteger factorial(int number) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
