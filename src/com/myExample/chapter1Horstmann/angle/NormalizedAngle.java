package com.myExample.chapter1Horstmann.angle;

import java.util.Scanner;

public class NormalizedAngle {
    /*    2. Write a program that reads an integer angle (which may be positive or negative)
        and normalizes it to a value between 0 and 359 degrees.
        Try it first with the % operator, then with floorMod.*/
    private int angle;

    public void normalized() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the angle in degrees");
        int angle = in.nextInt();

        if (angle > 0) {
            this.angle = angle % 360;
        } else {
            this.angle = 360 - Math.abs(angle % 360);
        }
        System.out.println("Normalized angle=" + this.angle);

        int fullAngle = 360;
        this.angle = Math.floorMod(angle, fullAngle);
        System.out.println("Normalized angle=" + this.angle);
        in.close();
    }
}
