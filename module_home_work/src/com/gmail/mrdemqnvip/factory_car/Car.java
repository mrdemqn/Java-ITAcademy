package com.gmail.mrdemqnvip.factory_car;

abstract public class Car {
    private CarType model;

    public Car(CarType model) {
        this.model = model;
    }
    abstract protected void construct();

    public CarType getModel() {
        return model;
    }

    public void setModel(CarType model) {
        this.model = model;
    }
}
