package com.gmail.mrdemqnvip.arrays.array_butterfly;

public class Butterfly {

    public static void main(String[] args) {

        int arrButt[][] = {{1, 1, 1, 1, 1}, {0, 1, 1, 1, 0}, {0, 0, 1, 0, 0}, {0, 1, 1, 1, 0}, {1, 1, 1, 1, 1}};
        for (int i = 0; i < arrButt.length; i++) {
            for (int j = 0; j < arrButt[i].length; j++) {

                System.out.print(arrButt[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int arrButt2[][] = {{1, 1, 1, 1, 1, 1, 1}, {0, 1, 1, 1, 1, 1, 0}, {0, 0, 1, 1, 1, 0, 0},
                             {0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 1, 0, 0},
                              {0, 1, 1, 1, 1, 1, 0}, {1, 1, 1, 1, 1, 1, 1}};
        for (int i = 0; i < arrButt2.length; i++) {
            for (int j = 0; j < arrButt2[i].length; j++) {

                System.out.print(arrButt2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int arrButt3[][] = {{1, 1, 1, 1, 1, 1, 1, 1, 1}, {0, 1, 1, 1, 1, 1, 1, 1, 0}, {0, 0, 1, 1, 1, 1, 1, 0, 0},
                            {0, 0, 0, 1, 1, 1, 0, 0, 0}, {0, 0, 0, 0, 1, 0, 0, 0, 0}, {0, 0, 0, 1, 1, 1, 0, 0, 0},
                             {0, 0, 1, 1, 1, 1, 1, 0, 0}, {0, 1, 1, 1, 1, 1, 1, 1, 0},{1, 1, 1, 1, 1, 1, 1, 1, 1}};
        for (int i = 0; i < arrButt3.length; i++) {
            for (int j = 0; j < arrButt3[i].length; j++) {

                System.out.print(arrButt3[i][j] + " ");
            }
            System.out.println();
        }
    }
}