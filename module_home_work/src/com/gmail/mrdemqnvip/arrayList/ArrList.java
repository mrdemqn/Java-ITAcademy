package com.gmail.mrdemqnvip.arrayList;
import java.util.ArrayList;
import java.util.Iterator;

import java.util.Scanner;

class ClassA extends ArrList {
    private String name;
    private String surname;


    public ClassA(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return  name + surname;
    }
}

public class ArrList {
    public static void main(String[] args) {
//        Scanner consoleScanner = new Scanner(System.in);
//        System.out.println("Enter element: ");
//        String elem = consoleScanner.nextLine();
//        Integer.parseInt(elem);
        int element = 4;
        int negative = 3;
        ArrayList<Integer> listStudentsMarks = new ArrayList<>(element);
        ArrayList<ClassA> list1 = new ArrayList<>(element);

         list1.add(new ClassA("Ayai ", "Olouwakemi "));

         list1.add(new ClassA("Gennady ", "Akimov "));

         list1.add(new ClassA("Inna ", "Anokhina "));

         list1.add(new ClassA("Yana ", "Bocharova " ));

        for (int i = 0; i < element; i++)
        {
            Integer a = (int)(Math.random() * 10 + 1);
            listStudentsMarks.add(a);
        }
        System.out.println("Marks students: " + listStudentsMarks + list1);
        for(Iterator<Integer> it = listStudentsMarks.iterator(); it.hasNext();)
            if(it.next()<= negative)
                it.remove();
        System.out.println("Format marks students: " + listStudentsMarks + list1);
    }
}
