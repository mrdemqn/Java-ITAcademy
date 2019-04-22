package com.gmail.mrdemqnvip.console_example;
import java.util.Scanner;

import static java.lang.Math.*;

class ConsoleExample{

    public static void main(String args[]){
        Scanner console = new Scanner(System.in);

        int a = 4,b = 3;

        double d;

        int sum;

        int x = (int) Math.pow(a,2);
        int y = (int) Math.pow(b,2);

        sum = x + y;

        d = sqrt(sum);

        System.out.println(d + " = Радиус отверстия");

        System.out.println("Введите радиус картонки: ");
        String radius = console.nextLine();
        int r = Integer.parseInt(radius);

        if (r >= d) {
            System.out.println("Картонка закрывает отверстие");
        } else {
            System.out.println("Отверстие не закрыто полностью");
        }
    }
}