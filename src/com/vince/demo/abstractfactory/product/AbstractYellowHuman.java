package com.vince.demo.abstractfactory.product;

public abstract class AbstractYellowHuman  implements Human {

    @Override
    public void getColor() {

        System.out.println("皮肤黄色");
    }

    @Override
    public void talk() {

        System.out.println("大部分说中文");
    }
}
