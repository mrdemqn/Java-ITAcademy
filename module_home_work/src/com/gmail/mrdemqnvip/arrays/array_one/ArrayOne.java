package com.gmail.mrdemqnvip.arrays.array_one;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOne{
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        boolean isTrue = true;
        while (isTrue) {
            System.out.println("Enter array size: ");
            int size;
            size = Integer.parseInt(scann.nextLine());
            int[] array = new int[size];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (100 * Math.random());
            }
            System.out.println("Random array elements: "+ Arrays.toString(array));
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            System.out.println("The maximum array element is " + max);
            System.out.println("Do you want to continue?: [Continue] [Exit]");

            switch (scann.nextLine()) {
                case "Continue": {
                    System.out.println("Do you want to try again?: [Continue] [Exit]");
                } break;
                case "Exit": {
                    isTrue = false;
                    break;
                }
                default:
                    System.out.println("Your command is wrong");
            }
        }
        System.gc();
        System.out.println("Program exit");
        System.exit(0);
    }
}