package com.vince.demo.abstractfactory.product;

public abstract class AbstractBlackHuman implements Human {


    @Override
    public void getColor() {

        System.out.println("黑皮肤");
    }

    @Override
    public void talk() {

        System.out.println("黑人说非洲语");
    }
}
