package com.vince.demo.decorator;

/**
 * concreteComponent
 */
public class CakeImpl implements Cake {

    @Override
    public String nameDetail() {

        return "蛋糕";
    }

    @Override
    public Double price() {

        return 5.0;
    }
}
