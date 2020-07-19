package com.vince.demo.abstractfactory.factory;

import com.vince.demo.abstractfactory.product.Human;

/**
 * 1、工厂接口类只需要关心我们的产品族，不关心产品有多少个等级，只需定义产品抽象方法.
 *
 * 2、产品等级应该由具体的产品工厂实现进行处理
 *
 * 这也是与工厂方法之间的区别
 */
public interface HumanFactory {

    Human createYellowHuman();

    Human createBlackHuman();

    Human createWhiteHuman();

}
