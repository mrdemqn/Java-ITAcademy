package com.gmail.mrdemqnvip.factory_car;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        Car sedanCar = carFactory.buildCar(CarType.SEDAN);
        System.out.println("Sedan Car: " + sedanCar.getModel());

        Car smallCar = carFactory.buildCar(CarType.SMALL);
        System.out.println("Small Car: " + smallCar.getModel());

        Car luxuryCar = carFactory.buildCar(CarType.LUXURY);
        System.out.println("Luxury Car: " + luxuryCar.getModel());

    }
}
