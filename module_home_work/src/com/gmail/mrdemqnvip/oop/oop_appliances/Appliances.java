package com.gmail.mrdemqnvip.oop.oop_appliances;

public abstract class Appliances {

    public void work() {
        System.out.println("App is working");
    }
    public void powerOff() {
        System.out.println("Appliances is OFF ");
    }

    public void turningOn() {
        System.out.println("Appliances is ON ");
    }

    public abstract void makeCoffe();
}
