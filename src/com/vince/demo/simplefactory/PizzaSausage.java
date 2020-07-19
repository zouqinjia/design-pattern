package com.vince.demo.simplefactory;

/**
 * 香肠披萨
 */
public class PizzaSausage extends Pizza {


    @Override
    public void prepare() {

        System.out.println("pizza sausage prepare");
    }

    @Override
    public void make() {

        System.out.println("pizza sausage make");
    }

    @Override
    public void complete() {

        System.out.println("pizza sausage complete");
    }
}
