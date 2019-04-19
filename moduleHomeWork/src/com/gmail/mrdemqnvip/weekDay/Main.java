package com.gmail.mrdemqnvip.weekDay;

public class Main {

    public static void main(String[] args) {

        int s = 3700;

        int sec;

        int m;

        int min, h;

        sec = s % 60;

        m = (s -sec) / 60;

        min = m % 60;

        h = (m -min) / 60;

        System.out.println(h+" часов " + min + " минут " + sec + " секунд ");

        int d = 30;

        int day;

        int w;

        int week;

        day = d % 4;

        w = (d - day) / 7;

        week = d / 4;

        System.out.println("В 30-ти днях - " + w + " недель, " +  "а дней в неделе " + week);

    }

}
