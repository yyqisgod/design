package com.yyq.decorator;

/**
 * @author: 布里巴
 * @date: 2020/9/10
 */
public class Run {
    /**
     *
     * 优点
     *  1.不改变原有对象情况下给对象扩展功能
     *  2.遵守开闭原则
     * 缺点
     *  1.增加程序复杂性
     */
    public static void main(String[] args) {
        BatterCake batterCake;
        batterCake = new BatterCake();
        batterCake = new EggDecorator(batterCake);
        batterCake = new SausageDecorator(batterCake);
        System.out.println(batterCake.getPrice() + ":" + batterCake.getMsg());
    }
}
