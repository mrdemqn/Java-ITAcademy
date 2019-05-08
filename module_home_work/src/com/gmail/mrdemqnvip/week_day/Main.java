package com.gmail.mrdemqnvip.week_day;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanSec = new Scanner(System.in);

        System.out.println("Enter number seconds: ");

        int s = scanSec.nextInt();

        int sec;

        int m;

        int min, h;

        int hour, week, day;

        int d;

        sec = s % 60;

        m = (s -sec) / 60;

        min = m % 60;

        h = (m -min) / 60;

        hour = h % 24;

        d = (h - hour) / 24;

        day = d % 7;

        week = (d - day) / 7;

        System.out.println(h+" часов " + min + " минут " + sec + " секунд ");

        System.out.println(week + " week " + day + " day " + hour + " часов " + min + " минут " + sec + " секунд ");

    }

}
