package com.yyq.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: 布里巴
 * @review:
 * @date: 2019/5/16
 * <p>
 * 实现动态代理的逻辑
 */
public class OrderHandlerProxy implements InvocationHandler {

    //委托类，相当于OrderHandler类的对象
    private Object target;

    Object bind(Object target) {
        this.target = target;

        //传入（调用对象的类加载器，调用对象的接口，调用对象本身）
        return Proxy.newProxyInstance(this.target.getClass().getClassLoader(), this.target.getClass().getInterfaces(), this);
    }

    /**
     * 具体实现逻辑
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //判断方法是否是需要处理的方法
        if (method.getName().equalsIgnoreCase("handler")) {
            System.out.println("钱多任性");
            //获取方法参数
            String orderId = (String) args[0];

            //将orderId变成yyq
            if(orderId .equalsIgnoreCase("hj")){
                orderId = "yyq";
            }

            //通过反射调用委托类的方法
            Object invoke = method.invoke(target, orderId);

            System.out.println("钱用完了");

            return invoke;
        } else {
            //如果不是需要处理的方法，则原样返回
            return method.invoke(target, args);
        }
    }
}
