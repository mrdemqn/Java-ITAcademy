package com.gmail.mrdemqnvip.fatorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        while (true) {
        Scanner number = new Scanner(System.in);
            System.out.println("Enter N: ");
            String command = number.nextLine();
            int n = Integer.parseInt(command);
            int factorial = 1;
            for (int f = 1; f <= n; f++) {
                factorial = factorial * f;
                System.out.println("Factorial: " + factorial);
            }
        }
    }
}