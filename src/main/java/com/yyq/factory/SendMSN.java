package com.yyq.factory;

/**
 * @author: 布里巴
 * @review:
 * @date: 2019/5/14
 */
public class SendMSN implements Sender {
    public void send() {
        System.out.println("发送短信");
    }
}
