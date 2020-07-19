package com.vince.demo.abstractfactory.factory;

import com.vince.demo.abstractfactory.product.Human;
import com.vince.demo.abstractfactory.product.FemaleBlackHuman;
import com.vince.demo.abstractfactory.product.FemaleWhiteHuman;
import com.vince.demo.abstractfactory.product.FemaleYellowHuman;

/**
 * 生产的是一个不同肤色的人产品族，这个产品的等级结构是：女性
 */
public class FemaleFactory implements HumanFactory {

    @Override
    public Human createYellowHuman() {

        return new FemaleYellowHuman();
    }

    @Override
    public Human createBlackHuman() {

        return new FemaleBlackHuman();
    }

    @Override
    public Human createWhiteHuman() {

        return new FemaleWhiteHuman();
    }
}
