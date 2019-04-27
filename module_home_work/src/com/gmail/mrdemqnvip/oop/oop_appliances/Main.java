package com.gmail.mrdemqnvip.oop.oop_appliances;

public class Main {
    public static void main(String[] args) {
        Appliances appliances = new CoffeeMachine();
        appliances.turningOn();
        appliances.makeCoffe();
        appliances.powerOff();

        CoffeeMachine washer = new Washer();
        washer.plugIntoSocket();
        washer.turningOn();
        washer.work();
        ((Washer)washer).washClothes();
        washer.powerOff();

    }
}
