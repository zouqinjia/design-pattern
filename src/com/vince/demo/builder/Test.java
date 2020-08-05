package com.vince.demo.builder;

/**
 * 建造者模式：
 * 1、封装性：使用建造者模式可以使客户端不必知道产品的内部实现细节.
 * 2、建造者相互独立，容易扩展：具体的建造者之间相互独立，对系统的扩展非常有利.
 * 3、便于控制细节风险：由于具体的建造者是独立的，因此可以对建造过程逐步细化，而不对其它的模块产生任何影响.
 * 定义：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示；多个产品构建过程相同，但是部件每个产品不一样.
 */
public class Test {

    public static void main(String[] args) {

        Director director = new Director();

        SmartRobotBuilder smartRobotBuilder = new SmartRobotBuilder();
        Robot smartRobot = director.buildRobot(smartRobotBuilder);
        System.out.println(smartRobot);

        NormalRobotBuilder normalRobotBuilder = new NormalRobotBuilder();

        Robot normalRobot = director.buildRobot(normalRobotBuilder);
        System.out.println(normalRobot);
    }

}
