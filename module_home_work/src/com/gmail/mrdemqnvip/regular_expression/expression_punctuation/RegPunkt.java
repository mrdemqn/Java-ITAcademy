package com.gmail.mrdemqnvip.regular_expression.expression_punctuation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Scanner;

public class RegPunkt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write text, please: ");
        String text = scanner.nextLine();
        Pattern regular = Pattern.compile("[-.?!)(,:;]");
        Matcher matcher = regular.matcher(text);
        int count = 0;
        while (matcher.find()){
            count++;
        }
        System.out.println("Number of punctuation marks in the entered text: "+ count);
    }
}