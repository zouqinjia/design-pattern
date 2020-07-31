package com.vince.demo.bridge.car;


import com.vince.demo.bridge.color.Color;

public abstract class Car {

     Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public Car(Color color) {
        this.color = color;
    }

    public abstract void makeCar(String carType);
}
