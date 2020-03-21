package com.myExample.fundamentalProgrammingStructures.maxOf3Int;

import java.util.Scanner;

public class MaxOf3Int {
    /*  3. Using only the conditional operator, write a program that reads three integers
        and prints the largest. Repeat with Math.max.*/

    public void maximum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three number");

        int number1 = in.nextInt();
        int number2 = in.nextInt();
        int number3 = in.nextInt();
        int max;
        if (number1 > number2) {
            max = number1;
        } else {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }
        System.out.println("Maximum=" + max);
        System.out.println("Maximum=" + Math.max(number3, Math.max(number1, number2)));
        in.close();
    }
}
