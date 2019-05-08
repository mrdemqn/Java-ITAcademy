package com.gmail.mrdemqnvip.arrayList.task_twenty_six;

public class Students {
    private int mark;
    private String nameSurname;

    public Students(int mark, String nameSurname) {
        this.mark = mark;
        this.nameSurname = nameSurname;
    }

    public int getMark() {
        return mark;
    }


    @Override
    public String toString() {
        return nameSurname + ": " + mark;
    }
}
