package com.vince.demo.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理调用类
 *
 * 1、动态代理在实现阶段不用关心代理谁？而在运行阶段才指定代理哪一个对象
 *
 * 2、动态代理主要意图是解决“审计”问题，也就是横向切面，在不改变我们已有代码结构的情况下增强或者控制对象的行为
 */
public class GamePlayerIH implements InvocationHandler {

    // 被代理实例
    private Object object;

    public GamePlayerIH(Object object) {

        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        return method.invoke(this.object,args);
    }
}
