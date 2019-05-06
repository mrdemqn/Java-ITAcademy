package com.gmail.mrdemqnvip.oop.oop_appliances;

public class Washer extends Appliances implements PlunIn {

    public Washer(String typeApp, String brandName, String principOper) {
        super(typeApp, brandName, principOper);
    }

    @Override
    public void plugIntoSocket() {

        System.out.println("Washer plug into the socket");
    }

    @Override
    public void powerOff() {
        System.out.println("Appliances is OFF ");
    }

    @Override
    public void turningOn() {
        System.out.println("Appliances is ON ");
    }

    public void washClothes () {
        System.out.println("Washer washes clothes ");
    }

}