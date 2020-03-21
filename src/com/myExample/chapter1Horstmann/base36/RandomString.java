package com.myExample.chapter1Horstmann.randomString;

import java.util.Random;

public class RandomString {
    /*    10. Write a program that produces a random string of letters and
        digits by generating a random long value and printing it in base 36.*/
    public  void randomString() {
        Random r = new Random();
        long number = r.nextLong();
        String result = Long.toString(number, 36);
        System.out.println(result);
    }
}

