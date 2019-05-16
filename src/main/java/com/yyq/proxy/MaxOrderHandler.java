package com.yyq.proxy;

/**
 * @author: 布里巴
 * @review:
 * @date: 2019/5/16
 */
public class MaxOrderHandler implements OrderHandler {
    public void handler(String orderId) {
        System.out.println("最大："+orderId);
    }
}
