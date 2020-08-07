package com.vince.demo.decorator;

import com.vince.demo.decorator.decorator.ChocolateCake;
import com.vince.demo.decorator.decorator.IceCreamCake;
import com.vince.demo.decorator.decorator.VanillaCake;

/**
 * 装饰者模式：
 * 动态地给一个对象提供一些额外的职责，就增加功能来说，装饰模式相比继承生成子类更为灵活
 * 1、装饰类和被装饰类可以独立发展，而不会相互耦合。换句话说，Component类无需指代Decorator类，Decorator类式从外部来扩展
 * Component类的功能，而Decorator也不用知道具体的构件。
 * 2、装饰模式是继承关系的一个替代方案，不管装饰多少层，返回的对象还是Component,实现的还是is-a的关系.
 * 3、装饰模式可以动态扩展一个实现类的功能.
 */
public class Test {

    public static void main(String[] args) {

        // 蛋糕
        Cake originalCake = new CakeImpl();
        System.out.println(originalCake.nameDetail() + "  " + originalCake.price());

        // 巧克力
        Cake chocolateCake = new ChocolateCake(originalCake);
        System.out.println(chocolateCake.nameDetail() + "  " + chocolateCake.price());
        // 香草
        Cake vanillaCake = new VanillaCake(chocolateCake);
        System.out.println(vanillaCake.nameDetail() + "  " + vanillaCake.price());
        // 冰激凌
        Cake iceCreamCake = new IceCreamCake(vanillaCake);
        System.out.println(iceCreamCake.nameDetail() + "  " + iceCreamCake.price());
    }
}
