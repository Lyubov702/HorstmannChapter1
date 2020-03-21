package com.myExample.chapter1Horstmann.lottery;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Lottery {
/*    13. Write a program that prints a lottery combination, picking six distinct numbers between 1 and 49.
    To pick six distinct numbers, start with an array list filled with 1...49.
    Pick a random index and remove the element. Repeat six times. Print the result in sorted order.*/

    public  void combination() {
        ArrayList<Integer> list = new ArrayList<>();
        int[] array = new int[6];
        for (int i = 1; i <= 49; i++) {
            list.add(i);
        }
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            int j = random.nextInt(49);
            array[i] = list.get(j);
            list.remove(j);
        }
        Arrays.sort(array);
        for (int i = 0; i < 6; i++) {
            System.out.print(array[i] + "  ");
        }
    }
}
