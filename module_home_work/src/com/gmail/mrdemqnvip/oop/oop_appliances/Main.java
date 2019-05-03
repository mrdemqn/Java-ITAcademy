package com.gmail.mrdemqnvip.oop.oop_appliances;

public class Main {
    public static void main(String[] args) {
        Appliances appliances = new CoffMach("Coffee Machine", "Moulinex", "Electrical");
        ((PlunIn) appliances).turningOn();
        ((CoffMach) appliances).makeCoffe();
        ((PlunIn) appliances).powerOff();
        System.out.println();

        CoffMach washer = new Washer("Washing machine", "LG electronics", "Electrical");
        washer.plugIntoSocket();
        washer.turningOn();
        washer.work();
        ((Washer)washer).washClothes();
        washer.powerOff();

    }
}
