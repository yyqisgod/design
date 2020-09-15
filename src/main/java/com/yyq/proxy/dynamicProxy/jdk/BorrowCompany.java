package com.yyq.proxy.dynamicProxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: 布里巴
 * @date: 2020/9/10
 */
public class BorrowCompany implements InvocationHandler {
    private Object object;

    Object bind(Object object){
        this.object = object;
        return Proxy.newProxyInstance(this.object.getClass().getClassLoader(),this.object.getClass().getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("准备借钱");
        Object invoke = method.invoke(this.object, args);
        System.out.println("借完钱");
        return invoke;
    }
}
