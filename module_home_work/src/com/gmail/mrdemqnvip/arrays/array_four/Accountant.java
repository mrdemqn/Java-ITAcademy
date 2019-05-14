package com.gmail.mrdemqnvip.arrays.array_four;

import java.math.BigDecimal;
import java.util.Scanner;

public class Accountant {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isTrue = true;
        while (isTrue) {
            System.out.println("Enter number: ");
            String num = scan.nextLine();
            try {
                Long.parseLong(num);
            } catch (NumberFormatException e) {
                System.out.println("Error, invalid number format. Try again");
                continue;
            }
            if (num.length() > 3) {
                System.out.println("Number is " + new String(accountNumber(num)));
            } else {
                System.out.println("Number is " + num);
            }
            System.out.println("Do you want to continue?: [Continue] [Exit]");

            switch (scan.nextLine()) {
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

    private static char[] accountNumber(String num) {
        int count = 0;
        char[] arrayNum = num.toCharArray();
        int lengtNum = arrayNum.length;
        int amountDistance = lengtNum % 3 == 0 ? lengtNum / 3 - 1 : (lengtNum - (lengtNum % 3)) / 3;
        char[] arrayNumWithDistance = new char[lengtNum + amountDistance];
        int j = 3;
        for (int i = 0; i < arrayNumWithDistance.length; i++) {
            if (i == 3) {
                arrayNumWithDistance[arrayNumWithDistance.length - 1 - i] = ' ';
                count++;
                continue;
            } else {
                if (j + 4 == i) {
                    arrayNumWithDistance[arrayNumWithDistance.length - 1 - i] = ' ';
                    j = i;
                    count++;
                    continue;
                }
            }
            arrayNumWithDistance[arrayNumWithDistance.length - 1 - i] = arrayNum[arrayNum.length - 1 - i + count];
        }
        return arrayNumWithDistance;

    }
}