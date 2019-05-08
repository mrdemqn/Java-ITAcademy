package com.gmail.mrdemqnvip.arrayList.task_twenty_six;

import java.util.ArrayList;
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
        for (int i = 0; i < studentsList.size(); i++){
            if(studentsList.get(i) != null){
                if(studentsList.get(i).getMark() < 4){
                    System.out.println("Student with bad mark:"+studentsList.get(i));
                    studentsList.remove(studentsList.get(i));
                    i = 0;
                }
            }
        }
        System.out.println("List student with bad mark: "+ studentsList);


    }

    private static String getNameSurname(Random rand, boolean isPerson) {
        if (isPerson) {
            return NAME_SURNAME[rand.nextInt(NAME_SURNAME.length)];
        } else{
            return NAME_SURNAME[rand.nextInt(NAME_SURNAME.length)];
        }

    }

}
