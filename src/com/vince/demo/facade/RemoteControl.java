package com.vince.demo.facade;

/**
 * facade
 * 门面角色
 */
public class RemoteControl {

    private TV tv;
    private AirConditioner airConditioner;
    private Light light;

    public RemoteControl(TV tv, AirConditioner airConditioner, Light light) {
        this.tv = tv;
        this.airConditioner = airConditioner;
        this.light = light;
    }

    public void   on(){

        System.out.println("一键开启");

        tv.on();
        airConditioner.on();
        light.on();
    }

    public void   off(){

        System.out.println("一键关闭");

        tv.off();;
        airConditioner.off();
        light.off();
    }
}
