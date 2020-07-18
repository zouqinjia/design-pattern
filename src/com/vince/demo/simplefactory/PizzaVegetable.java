package com.vince.demo.simplefactory;

/**
 * 蔬菜披萨
 */
public class PizzaVegetable extends Pizza {


    @Override
    void prepare() {

        System.out.println("pizza vegetable prepare");
    }

    @Override
    void make() {

        System.out.println("pizza vegetable make");
    }

    @Override
    void complete() {

        System.out.println("pizza vegetable complete");
    }
}
