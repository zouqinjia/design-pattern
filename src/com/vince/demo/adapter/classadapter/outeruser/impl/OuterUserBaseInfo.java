package com.vince.demo.adapter.classadapter.outeruser.impl;

import com.vince.demo.adapter.classadapter.outeruser.IOuterUserBaseInfo;

import java.util.HashMap;
import java.util.Map;

public class OuterUserBaseInfo implements IOuterUserBaseInfo {

    @Override
    public Map<String, String> getUserBaseInfo() {

        Map<String,String> map = new HashMap<>();

        map.put("userName","外部员工姓名V2");
        map.put("mobileNumber","外部员工手机号码v2");
        return map;
    }
}
