package com.vince.demo.decorator.decorator;

import com.vince.demo.decorator.Cake;

/**
 * Decorator
 */
public class CakeDecorator implements Cake {

    private Cake cake;

    public CakeDecorator(Cake cake) {
        this.cake = cake;
    }

    @Override
    public String nameDetail() {

        return cake.nameDetail();
    }

    @Override
    public Double price() {

        return cake.price();
    }
}
