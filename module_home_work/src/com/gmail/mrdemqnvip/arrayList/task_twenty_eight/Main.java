package com.gmail.mrdemqnvip.arrayList.task_twenty_eight;

import com.gmail.mrdemqnvip.arrayList.task_twenty_six.Students;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Main {
    private static String [] NAME_SURNAME = {"Ayai Olouwakemi","Akimov Gennady","Anokhina Inna","Bocharova Yana","Galchuk Darya",
            "Vinogradova Ekaterina","Bogush Yana","Baranovskaya Victoria","Valko Ulyana","Gorbunov Alexey",
            "Zakharchenya Nikita","Kravtsevich Yuliya"};

    public static void main(String[] args) {
        List<Students> studentsList = new ArrayList<>();
        Random rand = new Random();
        boolean isPerson = true;
        for(int i = 0; i < rand.nextInt(30);i++){
            studentsList.add(new Students(rand.nextInt(11),getNameSurname(rand,isPerson)));
        }
        System.out.println("List students with mark: "+ studentsList);

        Iterator<Students> studentsIterator = studentsList.iterator();
        Students students;
        int maxMark = 0;
        while (studentsIterator.hasNext()) {
            students = studentsIterator.next();
            if (students != null) {
                int mark = students.getMark();
                if (mark > maxMark) {
                    maxMark = mark;
                }
            }
        }
        System.out.println("Highest mark: " + maxMark);
        if (studentsList.size() != 0) {
            for (Students student1:studentsList) {
                if (student1 != null){
                    if(student1.getMark() == maxMark){
                        System.out.println("Student with highest mark: " + student1);
                    }
                }
            }
        }
    }

    private static String getNameSurname(Random rand, boolean isPerson) {
        if (isPerson) {
            return NAME_SURNAME[rand.nextInt(NAME_SURNAME.length)];
        } else{
            return NAME_SURNAME[rand.nextInt(NAME_SURNAME.length)];
        }

    }

}
