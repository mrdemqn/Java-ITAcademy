package com.gmail.mrdemqnvip.lambda_min_max;

public class PrintNumbers {

    public void numbersPrinter(Function intRandomGenerate) {
        System.out.println("Random numbers - " + intRandomGenerate.randomGenerate(intRandomGenerate.getLimit()));
    }

    public void printMinMax(ToDoubleFunction toDoubleFunction) {
        System.out.println(toDoubleFunction.findMinMax(100));
    }
}
