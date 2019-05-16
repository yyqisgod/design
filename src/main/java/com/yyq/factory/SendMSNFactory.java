package com.yyq.factory;

/**
 * @author: 布里巴
 * @review:
 * @date: 2019/5/14
 */
public class SendMSNFactory implements Provider {
    public Sender produce() {
        return new SendMSN();
    }
}
