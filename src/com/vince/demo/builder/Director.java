package com.vince.demo.builder;

/**
 * 导演类起封装作用，避免高层模块深入到建造者内部的实现类。
 */
public class Director {

    public Robot buildRobot(RobotBuilder robotBuilder) {

        robotBuilder.createHead();
        robotBuilder.createBody();
        robotBuilder.createLegs();
        return robotBuilder.createRobot();
    }


}
