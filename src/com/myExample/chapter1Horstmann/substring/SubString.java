package com.myExample.chapter1Horstmann.substring;

import java.util.Scanner;

public class SubString {
    //     8. Write a program that reads a string and prints all of its nonempty substrings.

    public  void subString() {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if ((!str.substring(i, i + 1).equals(" "))) {
                for (int j = i + 1; j <= str.length(); j++) {
                    System.out.println(str.substring(i, j));
                }
            }
        }
    }
}
