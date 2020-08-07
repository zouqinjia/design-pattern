package com.vince.demo.decorator.decorator;

import com.vince.demo.decorator.Cake;

public class IceCreamCake extends CakeDecorator {


    public IceCreamCake(Cake cake) {
        super(cake);
    }

    @Override
    public String nameDetail() {

        return "冰激凌 + " + super.nameDetail();
    }

    @Override
    public Double price() {

        return 15.0 + super.price();
    }
}
