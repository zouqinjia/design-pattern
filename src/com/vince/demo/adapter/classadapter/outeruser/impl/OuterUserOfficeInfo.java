package com.vince.demo.adapter.classadapter.outeruser.impl;

import com.vince.demo.adapter.classadapter.outeruser.IOuterUserOfficeInfo;

import java.util.HashMap;
import java.util.Map;

public class OuterUserOfficeInfo implements IOuterUserOfficeInfo {

    @Override
    public Map<String, String> getUserOfficeInfo() {

        Map<String,String> map = new HashMap<>();
        map.put("jobPosition","外部员工工作地址V2");
        map.put("officeTelNumber","外部员工的办公电话V2");
        return map;
    }
}
