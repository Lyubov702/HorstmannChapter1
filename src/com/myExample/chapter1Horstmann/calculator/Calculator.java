package com.myExample.fundamentalProgrammingStructures.calculator;

import java.util.Scanner;

public class Calculator {
    /*    7. Write a program that reads in two integers between 0 and 4294967295, stores them in int variables,
        and computes and displays their unsigned sum, difference, product, quotient,
        and remainder. Do not convert them to long values.*/

    public void calculate() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two number");
        int number1 = (int) in.nextLong();
        int number2 = (int) in.nextLong();
        System.out.println("First number = " + Integer.toUnsignedLong(number1));
        System.out.println("Second number = " +Integer.toUnsignedLong(number2));
        System.out.println("Sum= "+ (Integer.toUnsignedLong(number1) + Integer.toUnsignedLong(number2)));
        System.out.println("Difference= "+ (Integer.toUnsignedLong(number1) - Integer.toUnsignedLong(number2)));
        System.out.println("Multiplication= "+ (Integer.toUnsignedLong(number1) * Integer.toUnsignedLong(number2)));
        System.out.println("Divisible= "+ (Integer.toUnsignedLong(number1) / Integer.toUnsignedLong(number2)));
        System.out.println("Remainder= "+ (Integer.toUnsignedLong(number1) % Integer.toUnsignedLong(number2)));
    }
}
