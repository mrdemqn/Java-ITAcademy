package com.gmail.mrdemqnvip.factory_car;

public class CarFactory {
    public Car buildCar(CarType model) {
        Car car1 = null;

        switch (model){
            case SEDAN: {
                car1 = new SedanCar(model);
                break;
            }
            case SMALL: {
                car1 = new SmallCar(model);
                break;
            }
            case LUXURY: {
                car1 = new LuxuryCar(model);
                break;
            }
        }


        return car1;
    }
}
