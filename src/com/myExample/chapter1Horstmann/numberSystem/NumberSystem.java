package com.myExample.chapter1Horstmann.numberSystem;

import java.util.Scanner;

public class NumberSystem {
/*   1. Write a program that reads an integer and prints it in binary, octal, and
    hexadecimal. Print the reciprocal as a hexadecimal floating-point number.*/

        public  void translation() {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the number");
            int number = in.nextInt();
            System.out.println("In Binary " + Integer.toBinaryString(number));
            System.out.println("In Octal " + Integer.toOctalString(number));
            System.out.println("In Hexadecimal " + Integer.toHexString(number));
            System.out.println("In reciprocal Hexadecimal " + Float.toHexString(1/number));
            in.close();
        }
}
