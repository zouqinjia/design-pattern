package com.vince.demo.abstractfactory.product;

public abstract class AbstractWhiteHuman implements Human {
    @Override
    public void getColor() {

        System.out.println("皮肤白色");
    }

    @Override
    public void talk() {

        System.out.println("大部分人说英文");
    }
}
