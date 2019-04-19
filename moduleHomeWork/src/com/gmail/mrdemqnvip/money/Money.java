package com.gmail.mrdemqnvip.money;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner consoleScanner = new Scanner(System.in);

        System.out.println("Введите: ");
        String money = consoleScanner.nextLine();
        int r = Integer.parseInt(money);


        if (r % 10 == 1) {
            System.out.println(r + " Рубль");
        }
        if (r % 10  == 2 | r % 10 == 3 | r % 10 == 4) {
            System.out.println(r + " Рубля");
        }
        if (r % 10 == 5 | r % 10 == 6 | r % 10 == 7 | r % 10 == 8 | r % 10 == 9 | r % 10 == 0) {
            System.out.println(r + " Рублей");
        }
    }
}

