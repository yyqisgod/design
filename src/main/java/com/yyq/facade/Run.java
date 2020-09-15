package com.yyq.facade;

/**
 * @author: 布里巴
 * @date: 2020/9/10
 */
public class Run {
    /**
     *
     * 优点
     *  1.简化调用过程，无须深入了解子系统
     *  2.减少系统以来，解耦
     *  3.更好的划分访问层次
     * 缺点
     *  1.当增加子系统和扩展子系统行为时，容易带来未知风险
     *  2.不符合开闭原则
     *  3.某些情况下可能违背单一职责原则
     */
    public static void main(String[] args) {
        ShopFacadeService shopFacadeService = new ShopFacadeService();
        shopFacadeService.shop();
    }
}
