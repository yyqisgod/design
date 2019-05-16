package com.yyq.factory;

/**
 * @author: 布里巴
 * @review:
 * @date: 2019/5/14
 */
public class Test {
    public static void main(String[] args) {
        new SendMSNFactory()
                .produce()
                .send();
        new SendQQfactory()
                .produce()
                .send();
    }
}
