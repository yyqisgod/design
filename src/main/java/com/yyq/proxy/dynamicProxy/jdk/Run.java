package com.yyq.proxy.dynamicProxy.jdk;

import com.yyq.bean.proxy.Person;
import com.yyq.bean.proxy.Trumb;

/**
 * @author: 布里巴
 * @date: 2020/9/10
 */
public class Run {
    public static void main(String[] args) {
        BorrowCompany borrowCompany = new BorrowCompany();
        Person person = (Person) borrowCompany.bind(new Trumb());
        person.borrowMoney();
    }
}
