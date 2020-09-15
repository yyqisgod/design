package com.yyq.proxy.staticProxy;

import com.yyq.bean.proxy.Person;
import com.yyq.bean.proxy.Trumb;

/**
 * @author: 布里巴
 * @date: 2020/9/10
 */
public class ChinaProxy implements Person {
    private Trumb trumb;

    public ChinaProxy(Trumb trumb) {
        this.trumb = trumb;
    }

    public void borrowMoney() {
        trumb.borrowMoney();
        System.out.println("没借到");
    }
}
