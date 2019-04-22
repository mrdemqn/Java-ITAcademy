package com.gmail.mrdemqnvip.arrays.array_two;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int i = 0;

        while (true) {
            String s = scan.nextLine();
            if ("Sum".equals(s)) {
                break;
            } else {
                i = i + Integer.valueOf(s);
            }
        }
        System.out.println("Sum = " + i);
    }

}
