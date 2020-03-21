package com.myExample.chapter1Horstmann.magicSquare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MagicSquare {
        /* Write a program that reads a two-dimensional array of integers and determines
        whether it is a magic square (that is, whether the sum of all
        rows, all columns, and the diagonals is the same). Accept lines of input
        that you break up into individual integers, and stop when the user enters
        a blank line.*/

    public void magicSquareCheck() {
        ArrayList<String> inputStrings = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String str;
        System.out.println("Enter the two-dimensional array");
        while (true) {
            str = in.nextLine();
            if (str.equals("")) break;
            inputStrings.add(str);
        }

        int[][] array = new int[inputStrings.size()][inputStrings.size()];
        for (int i = 0; i < inputStrings.size(); i++) {
            array[i] = Arrays.stream(inputStrings.get(i).split("\\s"))
                    .mapToInt(Integer::parseInt).toArray();
        }
        printArray(array);
        if (rowsCheck(array) && columnsCheck(array) && diagonalsCheck(array)) {
            System.out.println("magic square");
        } else {
            System.out.println("not magic square");
        }
    }

    private static boolean diagonalsCheck(int[][] array) {
        int mainDiagonalSum = 0;
        int diagonal2Sum = 0;
        int size = array.length;
        for (int i = 0; i < size; i++) {
            mainDiagonalSum += array[i][i];
        }
        int count = 0;
        for (int i = (size - 1); i >= 0; i--) {
            diagonal2Sum += array[count][i];
            count++;
        }
        if (mainDiagonalSum != diagonal2Sum) {
            return false;
        } else return true;
    }

    private static boolean columnsCheck(int[][] array) {
        int column1Sum = 0;
        int columnSum;

        for (int[] ints : array) column1Sum += ints[0];

        for (int i = 1; i < array.length; i++) {
            columnSum = 0;
            for (int[] ints : array) {
                columnSum += ints[i];
            }
            if (columnSum != column1Sum) {
                return false;
            }
        }
        return true;
    }

    private static boolean rowsCheck(int[][] array) {
        int row1Sum = 0;
        int rowSum;

        for (int i = 0; i < array.length; i++) {
            row1Sum += array[0][i];
        }

        for (int i = 1; i < array.length; i++) {
            rowSum = 0;
            for (int j = 0; j < array.length; j++) {
                rowSum += array[i][j];
            }

            if (rowSum != row1Sum) {
                return false;
            }
        }
        return true;
    }

    private static void printArray(int[][] array) {
        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(ints[j] + "  ");
            }
            System.out.println();
        }
    }
}
