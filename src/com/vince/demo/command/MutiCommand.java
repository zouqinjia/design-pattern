package com.vince.demo.command;

public class MutiCommand extends AbstractCommand {

    @Override
    public int execute(int value) {

        this.value = value;

        return receiver.muti(value);
    }

    @Override
    public int reset() {

        return receiver.muti(1)/value;
    }
}
