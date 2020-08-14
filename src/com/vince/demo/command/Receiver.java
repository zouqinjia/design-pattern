package com.vince.demo.command;

public  class Receiver {

    int number = 0;

    public int add(int value) {

        number = number + value;
        return number;
    }

    public int muti(int value) {

        number = number * value;
        return number;
    }

}
