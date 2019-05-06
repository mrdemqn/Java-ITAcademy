package com.gmail.mrdemqnvip.day_week_year;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DayWeekYear date = new DayWeekYear();
        while (true) {
            System.out.println("Enter day");
            String d = scanner.nextLine();
            if(d.equals("exit")){
                System.exit(0);
            }
            System.out.println("Enter month");
            String m = scanner.nextLine();
            System.out.println("Enter year");
            String y = scanner.nextLine();
            int day = 0;
            int month = 0;
            int year = 0;
            try {
                day = Integer.parseInt(d);
                month = Integer.parseInt(m);
                year = Integer.parseInt(y);
            }catch (NumberFormatException e){
                System.out.println("Invalid format, please try again" );
                continue;
            }
            int nextDay;
            if(date.checkInsertDate(day,month,year)) {
                String separator;
                if (month == 9 && day == 30){
                    separator =".";
                } else {
                    if(month < 10 ) {separator = ".0";}
                    else {
                        separator =".";
                    }
                }

                if (month == 1 || month == 3 || month == 5 || month == 7 || month == 10 || month == 12) {
                    nextDay = date.inMonthWithThirtyOneDay(day);
                    if (month == 12 && nextDay == 1) {
                        System.out.println("Next day is " + nextDay + ".1" + "." + (year + 1));
                    } else {
                        if (nextDay == 1) {
                            System.out.println("Next day is " + nextDay + separator + (month + 1) + "." + year);
                        } else {
                            System.out.println("Next day is " + nextDay + separator + month + "." + year);
                        }

                    }
                } else {
                    if (month == 2) {
                        nextDay = date.nextDayInFebryary(day, year);
                        if (nextDay == 1) {
                            System.out.println("Next day is " + nextDay + separator + (month + 1) + "." + year);
                        } else
                        {System.out.println("Next day is " + nextDay + separator + month + "." + year);
                        }

                    } else {
                        nextDay = date.inMonthWithThirtyDay(day);
                        if (nextDay == 1) {
                            System.out.println("Next day is " + nextDay + separator + (month + 1) + "." + year);
                        } else {
                            System.out.println("Next day is " + nextDay + separator + month + "." + year);
                        }
                    }
                }
            }
        }
    }
}