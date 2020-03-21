package com.myExample.fundamentalProgrammingStructures.task8;

import java.util.Scanner;

public class Main {
    //     8. Write a program that reads a string and prints all of its nonempty substrings.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        SubString(str);
    }

    public static void SubString(String str) {
        for (int i = 0; i < str.length(); i++) {
            if ((!str.substring(i, i + 1).equals(" "))) {
                for (int j = i + 1; j <= str.length(); j++) {
                    System.out.println(str.substring(i, j));
                }
            }
        }
    }
}
