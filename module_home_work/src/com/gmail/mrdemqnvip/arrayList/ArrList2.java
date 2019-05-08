package com.gmail.mrdemqnvip.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrList2 {

    public static void main(String[] args) {

        Scanner consoleScanner = new Scanner(System.in);
        System.out.println("Enter element: ");
        String elem = consoleScanner.nextLine();
        int element = Integer.parseInt(elem);
        int negative = 3;
        ArrayList<Integer> listStudentsMarks2 = new ArrayList<>(element);

        for (int i = 0; i < element; i++) {
                int a = (int) (Math.random() * 10 + 1);
                listStudentsMarks2.add(a);
            }
        System.out.println("Marks students: " + listStudentsMarks2);

            ArrayList<Integer> negativeList = new ArrayList<>();
            for (int i = 0; i < element; i++) {
                int k = listStudentsMarks2.get(i);
                if (k <= negative) {
                    negativeList.add(k);
                }
            }
            listStudentsMarks2.removeAll(negativeList);
            System.out.println("Format marks students: " + listStudentsMarks2);
        }

}
// listStudentsMarks2.add("Abdrahmanova Elfia" + ". Mark - " + marks + "\n");
//
//         listStudentsMarks2.add("Ayai Olouwakemi" + ". Mark - " + marks + "\n");
//
//         listStudentsMarks2.add("Akimov Gennady" + ". Mark - " + marks + "\n");
//
//         listStudentsMarks2.add("Anokhina Inna" + ". Mark - " + marks + "\n");
//
//         listStudentsMarks2.add("Bocharova Yana" + ". Mark - " + marks + "\n");
//
//         listStudentsMarks2.add("Galchuk Darya" + ". Mark - " + marks + "\n");
//
//         listStudentsMarks2.add("Vinogradova Ekaterina" + ". Mark - " + marks + "\n");
//
//         listStudentsMarks2.add("Bocharova Yana" + ". Mark - " + marks + "\n");
//
//
//
//         System.out.println(listStudentsMarks2);
//
//
//
//
