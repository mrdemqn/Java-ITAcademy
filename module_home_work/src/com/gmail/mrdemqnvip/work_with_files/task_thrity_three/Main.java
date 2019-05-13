package com.gmail.mrdemqnvip.work_with_files.task_thrity_three;

import java.io.*;

public class Main {
    public static void main(String[] args) {
       File path = new File("F:\\Презентация\\");
       for (File file : path.listFiles()) {
           if (file.isFile()) {
               System.out.println("Name file: " + file.getName());
           } if (file.isDirectory()) {
               System.out.println("Name directory: " + file.toPath());
           }
       }
    }
}