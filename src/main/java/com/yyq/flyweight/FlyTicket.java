package com.yyq.flyweight;

/**
 * @author: 布里巴
 * @date: 2020/9/11
 */
public class FlyTicket implements ITicket {
    private String from;
    private String to;

    public FlyTicket(String from, String to) {
        System.out.println("创建对象");
        this.from = from;
        this.to = to;
    }

    public void showInfo() {
        System.out.println(from + "->" + to);
    }
}
