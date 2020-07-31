package com.vince.demo.bridge.car;

import com.vince.demo.bridge.color.Color;

public class CarImpl extends Car {


    public CarImpl(Color color) {
        super(color);
    }

    @Override
    public void makeCar(String carType) {

        color.addColor(carType);
    }
}
