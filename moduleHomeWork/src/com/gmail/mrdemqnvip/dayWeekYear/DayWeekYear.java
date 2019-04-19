package com.gmail.mrdemqnvip.dayWeekYear;


public class DayWeekYear {

    public static void main(String[] args) {
        int day, month, year, d;
        day = 19;
        month = 4;
        year = 2019;
        d = day + 1;

        switch (day + 1) {
            case 6:
                System.out.println("Дата след дня " + day + "." + month + "." + year);
        }
    }

}
