package com.yyq.proxy.staticProxy;

import com.yyq.bean.proxy.Trumb;

/**
 * @author: 布里巴
 * @date: 2020/9/10
 */
public class Run {
    /**
     * 缺点
     *  1.每一个类都要写一个代理类，并且实现接口
     *
     */
    public static void main(String[] args) {
        ChinaProxy chinaProxy = new ChinaProxy(new Trumb());
        chinaProxy.borrowMoney();
    }
}
