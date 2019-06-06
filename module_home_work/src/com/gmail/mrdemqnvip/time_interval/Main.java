package com.gmail.mrdemqnvip.time_interval;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isTrue = true;
        while (isTrue) {
            System.out.println("Enter total count seconds [s] or in format hh:mm:ss [hms]");
            switch (scanner.nextLine()) {
                case "s": {
                    enterTotalCountSeconds(scanner);
                    break;
                }
                case "hms": {
                    enterInFormatHMS(scanner);
                    break;
                }
            }

        System.out.println("Do you want to continue?: [C] [E]");
        switch (scanner.nextLine()) {
            case "C": {
                break;
            }
            case "E": {
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

    public static void enterTotalCountSeconds(Scanner scanner) {
        System.out.println("Enter first total count seconds:");
        String t1 = scanner.nextLine();
        System.out.println("Enter second total count seconds:");
        String t2 = scanner.nextLine();
        IntervalTime tInterv1;
        IntervalTime tInterv2;
        try {
            tInterv1 = new IntervalTime(Integer.parseInt(t1));
            tInterv2 = new IntervalTime(Integer.parseInt(t2));
        } catch (NumberFormatException e) {
            System.out.println("Error format. Enter integer number");
            return;
        }
       comparison(tInterv1, tInterv2);
        return;
    }

    public static void enterInFormatHMS(Scanner scanner) {
        System.out.println("Enter first time interval:");
        String[] t1 = scanner.nextLine().split(":");
        System.out.println("Enter second time interval:");
        String[] t2 = scanner.nextLine().split(":");
        if (t1.length < 3 || t2.length < 3) {
            System.out.println("You have not entered the correct time interval. \n Enter in the format [hour: minute: second]");
            return;
        }
        IntervalTime tInterv1;
        IntervalTime tInterv2;
        try {
            tInterv1 = new IntervalTime(Integer.parseInt(t1[0]), Integer.parseInt(t1[1]), Integer.parseInt(t1[2]));
            tInterv2 = new IntervalTime(Integer.parseInt(t2[0]), Integer.parseInt(t2[1]), Integer.parseInt(t2[2]));

        } catch (NumberFormatException e) {
            System.out.println("Error format. Enter integer number");
            return;
        }
        comparison(tInterv1, tInterv2);
        return;
    }



    private static void comparison(IntervalTime tInterv1, IntervalTime tInterv2) {
        if (tInterv1.compareTo(tInterv2) > 0) {
            System.out.println("First "+ tInterv1 + " more then " + "second "+ tInterv2);
        } else if (tInterv1.compareTo(tInterv2) < 0) {
            System.out.println("First "+ tInterv1 + " less then " + "second "+ tInterv2);
        } else {
            System.out.println("First "+ tInterv1 + " equals " +"second "+ tInterv2);
        }
    }
}
