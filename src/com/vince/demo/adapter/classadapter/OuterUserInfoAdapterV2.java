package com.vince.demo.adapter.classadapter;

import com.vince.demo.adapter.classadapter.outeruser.IOuterUserBaseInfo;
import com.vince.demo.adapter.classadapter.outeruser.IOuterUserHomeInfo;
import com.vince.demo.adapter.classadapter.outeruser.IOuterUserOfficeInfo;
import com.vince.demo.adapter.userinfo.IUserInfo;

import java.util.Map;

/**
 * 背景：
 * 需要将外部系统中的用户信息集成到本地用户系统中,但是外部系统提供用户信息由多个接口组成；
 * JAVA不支持多继承所以对象适配器采用组合用户信息的方式与adaptee进行关联
 */
public class OuterUserInfoAdapterV2  implements IUserInfo {

    private IOuterUserBaseInfo iOuterUserBaseInfo;
    private IOuterUserHomeInfo iOuterUserHomeInfo;
    private IOuterUserOfficeInfo iOuterUserOfficeInfo;
    private Map<String,String> baseInfo ;
    private Map<String,String> homeInfo ;
    private Map<String,String> officeInfo ;

    public OuterUserInfoAdapterV2(IOuterUserBaseInfo iOuterUserBaseInfo, IOuterUserHomeInfo iOuterUserHomeInfo, IOuterUserOfficeInfo iOuterUserOfficeInfo) {
        this.iOuterUserBaseInfo = iOuterUserBaseInfo;
        this.iOuterUserHomeInfo = iOuterUserHomeInfo;
        this.iOuterUserOfficeInfo = iOuterUserOfficeInfo;

        this.baseInfo = iOuterUserBaseInfo.getUserBaseInfo();
        this.homeInfo = iOuterUserHomeInfo.getUserHomeInfo();
        this.officeInfo = iOuterUserOfficeInfo.getUserOfficeInfo();
    }

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
