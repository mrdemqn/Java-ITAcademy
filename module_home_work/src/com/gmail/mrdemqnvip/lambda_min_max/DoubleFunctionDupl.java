package com.gmail.mrdemqnvip.lambda_min_max;

import java.util.Random;

public class DoubleFunctionDupl {
    public int findMin(int x) {
        Random random = new Random();
        int a = random.nextInt(100);
        int b = random.nextInt(100);
        System.out.println("a - " + a + " b - " + b);
        int min = Math.min(a,b);
        return min;
    }
    public int findMax(int x) {
        Random random = new Random();
        int a = random.nextInt(100);
        int b = random.nextInt(100);
        System.out.println("a - " + a + " b - " + b);
        int min = Math.max(a,b);
        return min;
    }
}
