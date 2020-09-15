package com.yyq.flyweight;

/**
 * @author: 布里巴
 * @date: 2020/9/11
 */
public class Run {
    /**
     *
     * 优点：
     *  1.减少对象创建，降低内存对象数量，降低系统内存，提高效率
     * 缺点
     *  1.使系统复杂化
     *  2.关注内、外部状态，线程安全问题
     *
     */
    public static void main(String[] args) {
        FlyTicketFactory flyTicketFactory = new FlyTicketFactory();
        flyTicketFactory.queryTicket("黑龙江","长江").showInfo();
        flyTicketFactory.queryTicket("黑龙江","长江").showInfo();
        flyTicketFactory.queryTicket("黑龙江","东北").showInfo();
    }
}
