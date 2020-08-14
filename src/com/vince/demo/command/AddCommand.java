package com.vince.demo.command;

public class AddCommand extends AbstractCommand {

    @Override
    public int execute(int value) {

        this.value = value;

        return receiver.add(value);
    }

    @Override
    public int reset() {

        return receiver.add(-value);
    }
}
