package com.vince.demo.simplefactory;

/**
 * 蔬菜披萨
 */
public class PizzaVegetable extends Pizza {


    @Override
    public void prepare() {

        System.out.println("pizza vegetable prepare");
    }

    @Override
    public void make() {

        System.out.println("pizza vegetable make");
    }

    @Override
    public void complete() {

        System.out.println("pizza vegetable complete");
    }
}
