package com.vince.demo.decorator.decorator;

import com.vince.demo.decorator.Cake;

public class VanillaCake extends CakeDecorator {

    public VanillaCake(Cake cake) {
        super(cake);
    }

    @Override
    public String nameDetail() {

        return "香草 + " + super.nameDetail();
    }

    @Override
    public Double price() {

        return 13.0 + super.price();
    }
}
