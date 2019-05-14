package com.gmail.mrdemqnvip.rectangle_circle;

import java.io.Console;

public class RectangleCircle {
    public static void main(String[] args) {
        Console console = System.console();
        System.out.println("Enter long rectangle ");
        String a = console.readLine();
        System.out.println("Enter width rectangle ");
        String b = console.readLine();
        System.out.println("Enter radius circle ");
        String r = console.readLine();

            double length = Double.parseDouble(a);
            double width = Double.parseDouble(b);
            double radius = Double.parseDouble(r);
            if(length == 0){
                System.out.println("Error. The length cannot be zero");
                System.out.println("Try again enter correctly data");
            }
                if (width == 0){
                    System.out.println("Error.The width cannot be zero");
                    System.out.println("Try again enter correctly data");
                }
                if (radius == 0) {
                    System.out.println("Error.The radius cannot be zero");
                    System.out.println("Try again enter correctly data");
                } else {
                double diagonalRectangle = getDiagonalRectangle(length,width);
                double diametrCircle = 2 * radius;
                if( diagonalRectangle <= diametrCircle){
                    System.out.println("You can close rectangle hole with circular cardboard completely");
                }else {
                    System.out.println("You can not close rectangle hole with circular cardboard completely");
                }
            }

    }
    static double getDiagonalRectangle(double a, double b){
        return Math.sqrt(a*a+b*b);
    }
}

