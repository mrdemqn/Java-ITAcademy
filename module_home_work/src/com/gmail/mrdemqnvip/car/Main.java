package com.gmail.mrdemqnvip.car;

public class Main {
    public static void main(String[] args) {
        Car newCar = new Car ("RS 8");

        newCar.rs8Param ();
        System.out.println("isWorking = " + newCar.isWorking);
        System.out.println("Model = " + newCar.name);
        System.out.println("Class = " + newCar.carClass);
        System.out.println("Color RS 8 = " + newCar.colorCar);
        System.out.println("Max Speed = " + newCar.maxSpeedInKmH);
        System.out.println("Weight = " + newCar.weightInTon);
        System.out.println("Length Car = " + newCar.lengthMetr);
        System.out.println("Year Of Issue = " + newCar.yearOfIssue);
        System.out.println("Age = " + newCar.age);

        newCar.checkSpeed();
        newCar.speed += 5;
        newCar.checkSpeed();
        newCar.speed += 30;
        newCar.checkSpeed();
        newCar.speed += 60;
        newCar.checkSpeed();
        newCar.speed += 90;
        newCar.checkSpeed();
        System.out.println(newCar.condition);


        Car otherCar = new Car ("Q7");

        otherCar.q7Param();

        System.out.println("isWorking = " + otherCar.isWorking);
        System.out.println("Model = " + otherCar.name);
        System.out.println("Class = " + otherCar.carClass);
        System.out.println("Color Q7 = " + otherCar.colorCar);
        System.out.println("Max Speed = " + otherCar.maxSpeedInKmH);
        System.out.println("Weight = " + otherCar.weightInTon);
        System.out.println("Length Q7 = " + otherCar.lengthMetr);
        System.out.println("Year Of Issue = " + otherCar.yearOfIssue);
        System.out.println("Age = " + otherCar.age);
        System.out.println("Speed Q7 = " + otherCar.speed);
//        otherCar.checkSpeed();
//        otherCar.speed += 5;
//        otherCar.checkSpeed();
//        otherCar.speed += 30;
//        otherCar.checkSpeed();
//        otherCar.speed += 60;
//        otherCar.checkSpeed();
        System.out.println("Condition Q7 = " + otherCar.condition);
    }
}
