package com.gmail.mrdemqnvip.regular_expression.expression_word;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write text, please: ");
        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile("[a-zA-zа-яА-я]+");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()){
            count++;
        }
        System.out.println("Number of words in the entered text: "+ count);

    }
}