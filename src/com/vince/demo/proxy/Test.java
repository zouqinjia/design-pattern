package com.vince.demo.proxy;

import com.vince.demo.proxy.dynamic.GamePlayerIH;
import com.vince.demo.proxy.staticproxy.GamePlayerProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 代理模式：
 * 也叫委托模式,为其它对象提供一个代理以控制对这个对象的访问
 *
 */
public class Test {

    public static void main(String[] args) {

        // 未使用代理模式
        GamePlayer gamePlayer = new GamePlayer("sam");
        gamePlayer.login("3M", "12121");
        gamePlayer.killBoss();
        gamePlayer.upgrade();

        // 使用静态代理
        IGamePlayer staticProxy = new GamePlayerProxy(gamePlayer);
        staticProxy.login("阿萨姆", "121212");
        staticProxy.killBoss();
        staticProxy.upgrade();

        // 使用动态代理

        // 动态代理调用声明
        InvocationHandler gamePlayerIH = new GamePlayerIH(gamePlayer);
        // 生成代理对象
        IGamePlayer dynamicProxy = (IGamePlayer) Proxy.newProxyInstance(IGamePlayer.class.getClassLoader(), new Class[]{IGamePlayer.class}, gamePlayerIH);
        // 使用代理对象进行操作
        dynamicProxy.login("ABC", "123");
        dynamicProxy.killBoss();
        dynamicProxy.upgrade();
    }
}
