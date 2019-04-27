package com.gmail.mrdemqnvip.oop.oop_appliances;

public class Washer extends CoffeeMachine implements PlunIn {
    @Override
    public void plugIntoSocket() {
        System.out.println("Washer plug into the socket");
    }
    public void washClothes () {
        System.out.println("Washer washes clothes ");
    }

}