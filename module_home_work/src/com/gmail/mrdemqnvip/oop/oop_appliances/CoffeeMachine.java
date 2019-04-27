package com.gmail.mrdemqnvip.oop.oop_appliances;

public class CoffeeMachine extends Appliances implements PlunIn {

    public void makeCoffe() {
        System.out.println("Making coffee ");
    }

    @Override
    public void plugIntoSocket() {
        System.out.println("CoffeeMachine plug into the socket");
    }
}