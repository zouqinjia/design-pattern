package com.vince.demo.bridge;

import com.vince.demo.bridge.car.CarImpl;
import com.vince.demo.bridge.color.Black;
import com.vince.demo.bridge.color.Color;
import com.vince.demo.bridge.color.White;

/**
 * 桥梁模式：
 * 1、使用关联的方式把产品对象与产品属性对象的实现进行解耦，关联关系是弱关联。
 * 2、符合开闭原则，不管是产品类还是产品属性类都是面向接口编程。从产品或者属性对象两个维度来说都只需继承实现父类进行扩展即可.
 *
 *
 */
public class Test {

    public static void main(String[] args) {

        Color white = new White();
        Color black = new Black();

        CarImpl whiteCar = new CarImpl(white);
        whiteCar.makeCar("BMW");

        CarImpl blackCar = new CarImpl(black);
        blackCar.makeCar("Audi");
    }
}
