package com.vince.demo.adapter.objectadapter;

import com.vince.demo.adapter.userinfo.IUserInfo;
import com.vince.demo.adapter.outuserinfo.OuterUser;

import java.util.Map;

/**
 * 背景：
 * 需要将外部系统中的用户信息集成到本地用户系统中
 * 类适配器：继承OuterUser拥有外部用户信息行为，实现IUserInfo对外暴露的Target依旧是本地用户信息对象
 */
public class OuterUserInfoAdapter extends OuterUser implements IUserInfo {

    private Map<String,String> baseInfo = super.getUserBaseInfo();
    private Map<String,String> homeInfo = super.getUserHomeInfo();
    private Map<String,String> officeInfo = super.getUserOfficeInfo();

    @Override
    public String getUserName() {

        return this.baseInfo.get("userName");
    }

    @Override
    public String getHomeAddress() {

        return this.homeInfo.get("homeAddress");
    }

    @Override
    public String gteMobileNumber() {

        return this.baseInfo.get("homeAddress");
    }

    @Override
    public String getOfficeTelNumber() {

        return this.officeInfo.get("officeTelNumber");
    }

    @Override
    public String getJobPosition() {

        return this.officeInfo.get("jobPosition");
    }

    @Override
    public String getHomeTelNumber() {

        return this.homeInfo.get("homeTelNumber");
    }
}
