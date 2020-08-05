package com.vince.demo.builder;

public class SmartRobotBuilder extends RobotBuilder {

    Robot robot = new Robot();

    @Override
    void createHead() {

        robot.setHead("智能机器人 Head");
    }

    @Override
    void createBody() {

        robot.setBody("智能机器人 Body");
    }

    @Override
    void createLegs() {

        robot.setLegs("智能机器人 legs");
    }

    @Override
    Robot createRobot() {

        return robot;
    }
}
