package com.gmail.mrdemqnvip.example;

import java.util.Scanner;

public class Example {

    public static void main(String[] args) {

        Scanner consoleScanner = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        String number1 = consoleScanner.nextLine();

        System.out.println("Enter number 2: ");
        String number2 = consoleScanner.nextLine();

        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);

        if (num1 % 10 == 7) {
            System.out.println("In number 1: Seven found at the end");
        } else {
            System.out.println("In number 1: Seven not found");
        }
        if (num2 % 10 == 7) {
            System.out.println("In number 2: Seven found at the end");
        } else {
            System.out.println("In number 2: Seven not found");
        }
        int sum = num1 + num2;
        System.out.println("Total sum: " + sum);
    }

}