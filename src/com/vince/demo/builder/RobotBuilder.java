package com.vince.demo.builder;

/**
 * 抽象建造者
 *
 * 与抽象工厂最大的区别是建造者模式关注产品创建细节而工厂方法的重点是创建产品
 *
 */
public abstract class RobotBuilder {

    abstract void createHead();
    abstract void createBody();
    abstract void createLegs();

    abstract Robot createRobot();
}
