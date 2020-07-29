package com.vince.demo.adapter.userinfo;

public class UserInfo implements IUserInfo {

    @Override
    public String getUserName() {

        System.out.println("用户姓名");
        return "用户姓名";
    }

    @Override
    public String getHomeAddress() {

        System.out.println("家庭住址");
        return "家庭地址";
    }

    @Override
    public String gteMobileNumber() {

        System.out.println("手机号码");
        return "手机号码";
    }

    @Override
    public String getOfficeTelNumber() {

        System.out.println("办公电话");
        return "办公室电话";
    }

    @Override
    public String getJobPosition() {

        System.out.println("办公地点");
        return "办公地址";
    }

    @Override
    public String getHomeTelNumber() {

        System.out.println("家庭电话");
        return "家庭电话";
    }
}
