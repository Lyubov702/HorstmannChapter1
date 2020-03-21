package com.myExample.fundamentalProgrammingStructures.task2;

import java.util.Scanner;

public class Main {
/*    2. Write a program that reads an integer angle (which may be positive or negative)
    and normalizes it to a value between 0 and 359 degrees.
    Try it first with the % operator, then with floorMod.*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the angle in degrees");
        int angle = in.nextInt();
        int normalizedAngle = 0;

        if (angle > 0) {
            normalizedAngle = angle % 360;
        } else {
            normalizedAngle = 360 - Math.abs(angle % 360);
        }
        System.out.println("Normalized angle=" + normalizedAngle);

        int fullAngle = 360;
        normalizedAngle = Math.floorMod(angle, fullAngle);
        System.out.println("Normalized angle=" + normalizedAngle);
        in.close();
    }
}
