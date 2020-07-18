package com.vince.demo.simplefactory;

/**
 * 肉类披萨
 */
public class PizzaMete extends Pizza {


    @Override
    void prepare() {

        System.out.println("pizza mete prepare");
    }

    @Override
    void make() {

        System.out.println("pizza mete make");
    }

    @Override
    void complete() {

        System.out.println("pizza mete complete");
    }
}
