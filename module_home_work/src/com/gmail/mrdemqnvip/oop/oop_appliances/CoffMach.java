package com.gmail.mrdemqnvip.oop.oop_appliances;

public class CoffMach extends Appliances implements PlunIn {

    public CoffMach(String typeApp, String brandName, String principOper) {
        super(typeApp, brandName, principOper);
    }

    public void makeCoffe() {
        System.out.println("Making coffee ");
    }

    @Override
    public void plugIntoSocket() {
        System.out.println("CoffeeMachine plug into the socket");
    }

    @Override
    public void powerOff() {
        System.out.println("Appliances is OFF ");
    }

    @Override
    public void turningOn() {
        System.out.println("Appliances is ON ");
    }
}