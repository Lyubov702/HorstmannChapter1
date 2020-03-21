package com.myExample.fundamentalProgrammingStructures.factorial;

import java.math.BigInteger;

public class Factorial {
    /*    6. Write a program that computes the factorial n! = 1 × 2 × . . . × n,
      using BigInteger. Compute the factorial of 1000. */

    public void factorial() {
        int number = 1000;
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result);
    }
}
