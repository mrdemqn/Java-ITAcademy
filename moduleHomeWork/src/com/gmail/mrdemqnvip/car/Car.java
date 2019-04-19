package com.gmail.mrdemqnvip.car;

public class Car {

    String condition = "Auto still";

    String name = "Audi";

    String carClass = "Passenger Car";

    int yearOfIssue = 0x7df;

    double weightInTon = 2.1;

    int maxSpeedInKmH = 0x122;

    double lengthMetr = 5;

    int age = 4;

    String colorCar = "Silver";

    boolean isWorking;

    int speed;

    public Car () {
        isWorking = true;
        System.out.println("Car is Working()");
    }

    public Car (String name) {
        this();
        this.name = name;
        System.out.println("Car is Working(String name)");
    }

    public void checkSpeed() {
        System.out.println("Speed RS 8 = " + speed + " KmH");
        if (speed > 0) {
            condition  = "Motion Start";
        } else {
            condition = "Auto still";
        }
    }

    public void rs8Param () {
        yearOfIssue = yearOfIssue +1;
        age = age -1;
        weightInTon = weightInTon -0.25;
        maxSpeedInKmH = maxSpeedInKmH +20;
        lengthMetr = lengthMetr -0.10;
        colorCar = colorCar = "Black";
        if (speed > 0) {
            condition = "Motion Start";
        } else {
            condition = "Auto still";
        }

    }
    public void q7Param () {
        carClass = carClass = "SUV (Crossover)";

    }

}
