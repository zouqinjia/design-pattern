package com.vince.demo.abstractfactory;

import com.vince.demo.abstractfactory.factory.FemaleFactory;
import com.vince.demo.abstractfactory.factory.MaleFactory;
import com.vince.demo.abstractfactory.product.Human;

/**
 * 总结：
 * 抽象工厂模式中如果产品族中再新增一个产品X，就需要修改工厂接口增加创建产品X的方法，不符合开闭原则;
 * 但是如果再新增一种性别非常简单，只需要再创建一个相关产品的工厂即可，不需要修改工厂代码,符合开闭原则.
 * 所以结论是抽象工厂模式面向产品族扩展困难，但是面向产品等级扩展非常方便.从这个角度看是完全符合开闭原则的.
 */
public class Test {

    public static void main(String[] args) {

        // 女性
        FemaleFactory femaleFactory = new FemaleFactory();
        // 男性
        MaleFactory maleFactory = new MaleFactory();

        Human blackHuman = femaleFactory.createBlackHuman();
        humanProperty(blackHuman);
        System.out.println("==============================");

        Human whiteHuman = femaleFactory.createWhiteHuman();
        humanProperty(whiteHuman);
        System.out.println("==============================");

        Human yellowHuman = femaleFactory.createYellowHuman();
        humanProperty(yellowHuman);
        System.out.println("==============================");


        Human blackHuman1 = maleFactory.createBlackHuman();
        humanProperty(blackHuman1);
        System.out.println("==============================");

        Human whiteHuman1 = maleFactory.createWhiteHuman();
        humanProperty(whiteHuman1);
        System.out.println("==============================");

        Human yellowHuman1 = maleFactory.createYellowHuman();
        humanProperty(yellowHuman1);
        System.out.println("==============================");
    }

    private static void humanProperty(Human human) {

        human.getColor();
        human.getSex();
        human.talk();
    }


}
