package com.vince.demo.adapter;

import com.vince.demo.adapter.classadapter.OuterUserInfoAdapterV2;
import com.vince.demo.adapter.classadapter.outeruser.IOuterUserBaseInfo;
import com.vince.demo.adapter.classadapter.outeruser.IOuterUserHomeInfo;
import com.vince.demo.adapter.classadapter.outeruser.IOuterUserOfficeInfo;
import com.vince.demo.adapter.classadapter.outeruser.impl.OuterUserBaseInfo;
import com.vince.demo.adapter.classadapter.outeruser.impl.OuterUserHomeInfo;
import com.vince.demo.adapter.classadapter.outeruser.impl.OuterUserOfficeInfo;
import com.vince.demo.adapter.objectadapter.OuterUserInfoAdapter;
import com.vince.demo.adapter.userinfo.IUserInfo;
import com.vince.demo.adapter.userinfo.UserInfo;

/**
 * 背景：
 * 在工厂创建汽车的基础上增加修改颜色的需求
 * 方案：
 *
 */
public class Test {

    public static void main(String[] args) {

        // v1 稳定运行代码
        IUserInfo userInfo = new UserInfo();
        print(userInfo);
        // v2 类适配器
        IUserInfo userInfo1 = new OuterUserInfoAdapter();
        print(userInfo1);
        // v3 对象适配器
        IOuterUserBaseInfo iOuterUserBaseInfo = new OuterUserBaseInfo();
        IOuterUserHomeInfo iOuterUserHomeInfo = new OuterUserHomeInfo();
        IOuterUserOfficeInfo iOuterUserOfficeInfo = new OuterUserOfficeInfo();
        IUserInfo iUserInfo =  new OuterUserInfoAdapterV2(iOuterUserBaseInfo, iOuterUserHomeInfo, iOuterUserOfficeInfo);

        print(iUserInfo);

    }


    public static void print(IUserInfo userInfo){

        String homeAddress = userInfo.getHomeAddress();
        String homeTelNumber = userInfo.getHomeTelNumber();
        String jobPosition = userInfo.getJobPosition();
        String officeTelNumber = userInfo.getOfficeTelNumber();
        String userName = userInfo.getUserName();

        System.out.println("home address: "+ homeAddress + " home tel number: "+ homeTelNumber+
                " job position: "+ jobPosition+" office tel number: " + officeTelNumber +" user name : "+userName);
    }

}
