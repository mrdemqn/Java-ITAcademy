package com.gmail.mrdemqnvip.work_with_files.task_thrity;


import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyFile {
    public static void main(String[] args) {

        try {
            FileWriter fileWriter = new FileWriter("thrity.txt", false);
            String text = "My file, is wrong...";
            fileWriter.write(text);
            Pattern regular = Pattern.compile("[-.?!)(,:;]");
            Matcher matcher = regular.matcher(text);
            int count = 0;
            while (matcher.find()){
                count++;
            }
            Pattern pattern = Pattern.compile("[a-zA-zа-яА-я]+");
            Matcher matchW = pattern.matcher(text);
            int countW = 0;
            while (matchW.find()){
                countW++;
            }
            System.out.println("Text is: " + text + "\n" +
                    "Number of words in the entered text: "+
                    count + "\n" +
                    "Number of punctuation marks in the entered text: " +
                    countW);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}