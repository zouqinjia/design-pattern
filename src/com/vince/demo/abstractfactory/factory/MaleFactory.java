package com.vince.demo.abstractfactory.factory;

import com.vince.demo.abstractfactory.product.Human;
import com.vince.demo.abstractfactory.product.*;
/**
 * 生产的是一个不同肤色的人产品族，这个产品的等级结构是：男性
 * 不同的等级结构的产品制作方式上有区别，所以我们的制作流程会出现在我们的具体工厂里
 *
 * 在我们抽象工厂的模式中，具体工厂需要根据实际的生产需求来进行分类实现，达到用不同的具体工厂实现分类（等级结构），满足我们生产上的需求
 * （一般情况下我们的具体工厂类更加多的去关心我们的产品等级结构）
 */
public class MaleFactory implements HumanFactory {

    @Override
    public Human createYellowHuman() {
    
        return new MaleYellowHuman();
    }

    @Override
    public Human createBlackHuman() {

        return new MaleBlackHuman();
    }

    @Override
    public Human createWhiteHuman() {

        return new MaleWhiteHuman();
    }
}
