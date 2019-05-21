package com.gmail.mrdemqnvip.work_with_files.task_thrity_three;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("Enter directory path [P] or Exit [Exit]");
            switch (scan.nextLine()){
                case "P":{
                    ArrayList<File> filesList = new ArrayList<>();
                    ArrayList<File> directoryList = new ArrayList<>();
                    System.out.println("Enter directory path:");
                    File path = new File(scan.nextLine());
                    File[] pathes = path.listFiles();
                    if (pathes == null){
                        System.out.println("Error. 'pathes' is null");
                        return;}
                    for (File file:pathes){
                        if (file != null) {
                            if (file.isDirectory()) {
                                directoryList.add(file);
                            } else {
                                filesList.add(file);
                            }
                        }
                    }
                    System.out.println("Name directory: ");
                    printList(directoryList);
                    System.out.println("Name file: ");
                    printList(filesList);
                    break;
                }
                case "Exit":{
                    System.exit(0);
                }
                default:{
                    System.out.println("Error. Please try again");
                }
            }

        }
    }

    private static void printList(ArrayList<File> list) {
        if(list == null){
            return;
        }
        Iterator<File> iteratorList = list.iterator();
        File file;
        while (iteratorList.hasNext()){
            file =iteratorList.next();
            if(file != null){
                System.out.println(file.getName());
            }
        }
        System.out.println();
    }
}