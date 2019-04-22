package com.gmail.mrdemqnvip.arrays.arrayOne;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        long[] arrayOne = new long[10];
        int max = 0;

        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = Math.round(Math.random() * 100);
        }


        System.out.println(Arrays.toString(arrayOne));
        System.out.println("The largest number of array: " + max);
    }

}