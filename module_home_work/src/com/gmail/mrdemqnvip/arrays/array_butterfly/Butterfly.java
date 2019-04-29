package com.gmail.mrdemqnvip.arrays.array_butterfly;

import java.util.Scanner;


public class Butterfly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter size of square array: ");
            String sizeArr = scanner.nextLine();
            if (sizeArr.equals("Exit")) {
                System.exit(0);
            }
            int size;
            try {
                size = Integer.parseInt(sizeArr);
                if(size%2 == 0 && size !=0){
                    System.out.println("Error. Please enter an odd integer");
                    continue;
                }
                if (size<=1){
                    System.out.println("Error. Please enter integer more than 1");
                }

            } catch (NumberFormatException except) {
                System.out.println("Invalid format. Enter integer");
                continue;
            }
            int[][] array = new int[size][size];
            butterflyArray(array);
            array(array);
        }
    }

    private static void array(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void butterflyArray(int[][] array) {
        int midRow = (array.length - 1) / 2;
        for (int i = 0; i < array.length; i++) {
            if (i <= midRow) {
                for (int j = i; j < array[i].length - i; j++) {
                    array[i][j] = 1;
                    array[array.length - 1 - i][j] = 1;
                }
            }
        }
    }
}