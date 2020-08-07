package com.vince.demo.decorator.decorator;

import com.vince.demo.decorator.Cake;

public class ChocolateCake extends CakeDecorator {

    public ChocolateCake(Cake cake) {
        super(cake);
    }

    @Override
    public String nameDetail() {

        return "巧克力 + " + super.nameDetail();
    }

    @Override
    public Double price() {

        return 16.0 + super.price();
    }
}
