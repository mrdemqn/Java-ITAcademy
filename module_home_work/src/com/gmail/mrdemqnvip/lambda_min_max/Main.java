package com.gmail.mrdemqnvip.lambda_min_max;


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        PrintNumbers printNumbers = new PrintNumbers();
        Random random = new Random();

        System.out.println("Min");
        printNumbers.printMinMax(x ->{
            int a = random.nextInt(100);
            int b = random.nextInt(100);
            System.out.println("a - " + a + " b - " + b);
            int min = Math.min(a,b);
            return min;
                }

        );
        System.out.println("Max");
        printNumbers.printMinMax(x ->{
            int a = random.nextInt(100);
            int b = random.nextInt(100);
            System.out.println("a - " + a + " b - " + b);
            int max = Math.max(a,b);
            return max;
                }

        );

        System.out.println("Max number");
        DoubleFunctionDupl doubleFunctionDupl = new DoubleFunctionDupl();
        printNumbers.printMinMax(
                doubleFunctionDupl::findMax
        );
        System.out.println("Min number");
        printNumbers.printMinMax(
                doubleFunctionDupl::findMin
        );
    }



}
