package com.vince.demo.command;

/**
 * 命令模式：
 * 命令模式是一个高内聚的模式，将一个请求封装成一个对象，从而让你使用不同的请求把客户端参数化对请求排队或者记录请求日志，可以提供命令的撤销和恢复功能.
 * 1、类间解耦
 * 调用者角色与接收者角色之间没有任何依赖关系，调用者实现功能时只需要调用Command抽象类的execute方法就可以，不需要了解到底是哪个接收者执行。
 * 2、可扩展性
 * Command的子类可以非常容易地扩展，而调用者Invoker和高层次的模块Client不产生严重的代码耦合
 * 3、命令模式结合其他模式或更加优秀
 * 命令模式可以结合责任链模式，实现命令族解析任务，结合模板方法模式，则可以减少Command子类的膨胀问题.
 */

public class Test {

    public static void main(String[] args) {

        System.out.println("++++++++++++++++++++++++++++");
        Invoker invoker = new Invoker();
        AbstractCommand abstractCommand = new AddCommand();
        invoker.setAbstractCommand(abstractCommand);
        invoker.compute(1);
        invoker.compute(2);
        invoker.compute(3);
        invoker.undo();
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        AbstractCommand mutiCommand = new MutiCommand();
        invoker.setAbstractCommand(mutiCommand);
        invoker.compute(10);
        invoker.compute(10);
        invoker.undo();
    }
}
