package com.vince.demo.bridge.color;

public class Black implements Color {


    @Override
    public void addColor(String carType) {

        System.out.println(carType + " black");
    }
}
