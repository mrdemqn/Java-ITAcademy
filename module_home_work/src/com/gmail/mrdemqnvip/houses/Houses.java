package com.gmail.mrdemqnvip.houses;

import java.util.Scanner;

public class Houses {

    public static void main(String[] args) {
        Scanner house = new Scanner(System.in);

        System.out.println("Enter the size of the Plot [E]: ");
        String plotE = house.nextLine();
        int e = Integer.parseInt(plotE);

        System.out.println("Enter the size of the Plot [F]: ");
        String plotF = house.nextLine();
        int f = Integer.parseInt(plotF);

        System.out.println("Enter the size of the House1a [A]: ");
        String house1A = house.nextLine();
        int a = Integer.parseInt(house1A);
        System.out.println("Enter the size of the House1b [B]: ");
        String house1B = house.nextLine();
        int b = Integer.parseInt(house1B);

        System.out.println("Enter the size of the House2c [C]: ");
        String house2C = house.nextLine();
        int c = Integer.parseInt(house2C);
        System.out.println("Enter the size of the House2d [D]: ");
        String house2D = house.nextLine();
        int d = Integer.parseInt(house2D);

    if (a + c <= e && b + d <= f) {
        System.out.println("Houses within with plot");
    } else {
        System.out.println("Houses not within the plot");
    }
    }
}

