package com.yyq.proxy.dynamicProxy.cglib;

import com.yyq.bean.proxy.Person;
import com.yyq.bean.proxy.Trumb;

/**
 * @author: 布里巴
 * @date: 2020/9/10
 */
public class Run {
    public static void main(String[] args) {
        BorrowCompany borrowCompany = new BorrowCompany();
        Person bind = (Person) borrowCompany.bind(Trumb.class);
        bind.borrowMoney();
    }
}
