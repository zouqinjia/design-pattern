package com.vince.demo.simplefactory;

/**
 * 肉类披萨
 */
public class PizzaMete extends Pizza {


    @Override
    public void prepare() {

        System.out.println("pizza mete prepare");
    }

    @Override
    public void make() {

        System.out.println("pizza mete make");
    }

    @Override
    public void complete() {

        System.out.println("pizza mete complete");
    }
}
