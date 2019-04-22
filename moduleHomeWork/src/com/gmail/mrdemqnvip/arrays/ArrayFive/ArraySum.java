package com.gmail.mrdemqnvip.arrays.ArrayFive;

import java.util.Arrays;

public class ArraySum {

    public static void main(String[] args) {
        long[] arrayOne = new long[10];
        int sum = 0;

        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = Math.round(Math.random() * 100);
        }
        System.out.println(Arrays.toString(arrayOne));

    }

}
