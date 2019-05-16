package com.yyq.strategy;

/**
 * @author: 布里巴
 * @review:
 * @date: 2019/5/14
 */
public class Test {
    public static void main(String[] args) {
        //获取会员策略
        Preferential preferentialByCode = VipEnum.getPreferentialByCode(1);
        //获取上下文对象
        Context context = new Context(preferentialByCode);
        //获得结果
        double price = context.getPrice(300);
        System.out.println(price);
    }
}
