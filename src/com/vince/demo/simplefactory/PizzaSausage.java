package com.vince.demo.simplefactory;

/**
 * 香肠披萨
 */
public class PizzaSausage extends Pizza {


    @Override
    void prepare() {

        System.out.println("pizza sausage prepare");
    }

    @Override
    void make() {

        System.out.println("pizza sausage make");
    }

    @Override
    void complete() {

        System.out.println("pizza sausage complete");
    }
}
