package com.yyq.proxy.dynamicProxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author: 布里巴
 * @date: 2020/9/10
 */
public class BorrowCompany implements MethodInterceptor {

    public Object bind(Class<?> tClass){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(tClass);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object o1 = methodProxy.invokeSuper(o, objects);
        System.out.println("借钱完毕");
        return o1;
    }
}
