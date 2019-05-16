package com.yyq.proxy;

/**
 * @author: 布里巴
 * @review:
 * @date: 2019/5/16
 */
public class Test {
    public static void main(String[] args) {
        OrderHandlerProxy proxy = new OrderHandlerProxy();
        OrderHandler orderHandler = (OrderHandler) proxy.bind(new MaxOrderHandler());
        orderHandler.handler("hj");
    }
}
