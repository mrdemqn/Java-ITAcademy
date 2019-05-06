package com.gmail.mrdemqnvip.arrays.array_three;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = scan.nextInt();
        if (scan.hasNextLine()) {
            for (int i = (int) Math.sqrt(x); i >= 1; i--) {
                if (x % i == 0 && i != 1) {
                    System.out.println("This is not a natural number: " + x);
                    break;
                }
                    if (i == 1)
                        System.out.println("This is a natural number: " + x);
                    }
                    } else {
                        System.out.println("Error. Please enter number: " + x);
                    }
                }
        }