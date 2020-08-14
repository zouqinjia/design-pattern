package com.vince.demo.command;

public class Invoker {

    private AbstractCommand abstractCommand;

    public void setAbstractCommand(AbstractCommand abstractCommand) {
        this.abstractCommand = abstractCommand;
    }

    public void compute(int value) {

        int execute = abstractCommand.execute(value);
        System.out.println("计算结果为: " + execute);
    }

    public void undo() {

        int reset = abstractCommand.reset();

        System.out.println("撤销后结果为: " + reset);
    }
}
