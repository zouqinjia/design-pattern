package com.vince.demo.proxy.staticproxy;

import com.vince.demo.proxy.IGamePlayer;

/**
 * proxy 角色
 * 游戏代练
 */
public class GamePlayerProxy implements IGamePlayer {

    // 代理类持有实际业务逻辑对象的引用
    private IGamePlayer gamePlayer;

    public GamePlayerProxy(IGamePlayer gamePlayer) {

        this.gamePlayer = gamePlayer;
    }

    @Override
    public void login(String user, String password) {

        this.gamePlayer.login(user,password);
    }

    @Override
    public void killBoss() {

        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {

        this.gamePlayer.upgrade();
    }
}
