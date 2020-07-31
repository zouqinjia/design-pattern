package com.vince.demo.bridge.color;

public class White implements Color {

    @Override
    public void addColor(String carType) {

        System.out.println(carType + " white");
    }
}
