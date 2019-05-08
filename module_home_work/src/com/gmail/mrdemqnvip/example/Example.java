package com.gmail.mrdemqnvip.example;

import java.util.Scanner;

public class Example {

    public static void main(String[] args) {

        Scanner consoleScanner = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        String number = consoleScanner.nextLine();


        int num = Integer.parseInt(number);

        if (num % 10 == 7) {
            System.out.println("In number : Seven found at the end");
        } else {
            System.out.println("In number : Seven not found");
        }

        }

}