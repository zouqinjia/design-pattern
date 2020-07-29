package com.vince.demo.adapter.outuserinfo;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterUser {

    @Override
    public Map getUserBaseInfo() {

        Map<String,String> baseInfoMap = new HashMap<>();
        baseInfoMap.put("userName","外部员工姓名");
        baseInfoMap.put("mobileNumber","外部员工电话");
        return baseInfoMap;
    }

    @Override
    public Map getUserOfficeInfo() {

        Map<String,String> officeInfo = new HashMap<>();
        officeInfo.put("jobPosition","外部办公地址");
        officeInfo.put("officeTelNumber","外部员工办公电话");
        return officeInfo;
    }

    @Override
    public Map getUserHomeInfo() {

        Map<String,String> homeInfo = new HashMap<>();
        homeInfo.put("homeTelNumber","外部员工家庭电话");
        homeInfo.put("homeAddress","外部员工家庭地址");
        return homeInfo;
    }
}
