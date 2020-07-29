package com.vince.demo.adapter.classadapter.outeruser.impl;

import com.vince.demo.adapter.classadapter.outeruser.IOuterUserHomeInfo;

import java.util.HashMap;
import java.util.Map;

public class OuterUserHomeInfo implements IOuterUserHomeInfo {

    @Override
    public Map<String, String> getUserHomeInfo() {

        Map<String,String> map = new HashMap<>();
        map.put("homeTelNumber","外部员工家庭电话v2");
        map.put("homeAddress","外部员工家庭住址v2");
        return map;
    }
}
