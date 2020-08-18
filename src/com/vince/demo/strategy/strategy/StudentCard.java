package com.vince.demo.strategy.strategy;

public class StudentCard implements Card {

    @Override
    public double calculate(double price) {

        return price * 0.9;
    }
}
