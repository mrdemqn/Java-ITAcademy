package com.gmail.mrdemqnvip.dayWeekYear;


import java.util.Scanner;

public class DayWeekYear {

        int nextDay = 0;
        public int inMonthWithThirtyDay(int day){
            if (day == 30) {
                nextDay =  1;
            } else {
                nextDay = ++day;
            }
            return  nextDay;
        }
        public int inMonthWithThirtyOneDay(int day){
            if (day == 31) {
                nextDay =  1;
            } else {
                nextDay = ++day;
            }
            return nextDay;
        }
        public int nextDayInFebryary(int day, int year){
            if (year % 4 == 0 && day == 29) {
                nextDay = 1;
            } else {
                if (year % 4 == 0 && day == 28) {
                    nextDay = ++day;
                }else {
                    if (day == 28) {
                        nextDay = 1;
                    } else {
                        nextDay = ++day;
                    }
                }
            }
            return nextDay;
        }

        public boolean checkInsertDate(int day, int month, int year) {
            if (month < 1 || month > 12){
                System.out.println("Wrong, month must be in the range of 1 to 12, enter correct month");
                return false;
            } else{
                if ((month == 1 || month ==3 || month == 5 || month==7 || month ==10 || month ==12) && (day > 31 || day < 1) ){
                    System.out.println("Wrong, in "+month + " month day must be in the range of 1 to 31, enter correct day");
                    return false;
                } else{
                    if((month == 2 && year%4 == 0) && (day > 29 || day< 1)){
                        System.out.println("Wrong, in "+month + " month in leap year day must be in the range of 1 to 29, enter correct day");
                        return false;
                    }else{
                        if ((month == 2 && year%4 != 0) && (day > 28 || day< 1)){
                            System.out.println("Wrong, in "+month + " month in no leap year day must be in the range of 1 to 28, enter correct day");
                            return false;
                        }else {
                            if (day > 30 || day < 1){
                                System.out.println("Wrong, in "+month + " month day must be in the range of 1 to 30, enter correct day");
                                return false;
                            }else {return true;}
                        }
                    }
                }
            }

        }


    }