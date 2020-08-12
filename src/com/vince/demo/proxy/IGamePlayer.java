package com.vince.demo.proxy;

/**
 * subject 角色
 */
public interface IGamePlayer {

    /**
     * 登录
     */
    void login(String user,String password);

    /**
     * 杀怪
     */
    void killBoss();

    /**
     * 升级
     */
    void upgrade();
}
