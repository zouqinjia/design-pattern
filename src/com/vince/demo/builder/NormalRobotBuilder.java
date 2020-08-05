package com.vince.demo.builder;

public class NormalRobotBuilder extends RobotBuilder {

    Robot robot = new Robot();

    @Override
    void createHead() {

        robot.setHead("普通机器人 head");
    }

    @Override
    void createBody() {

        robot.setBody("普通机器人 body");
    }

    @Override
    void createLegs() {

        robot.setLegs("普通机器人 legs");
    }

    @Override
    Robot createRobot() {

        return robot;
    }
}
