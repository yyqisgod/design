package com.yyq.strategy;

import java.math.BigDecimal;

/**
 * @author: 布里巴
 * @review:
 * @date: 2019/5/14
 *
 * 上下文对象
 */
public class Context {
    private Preferential preferential;

    public Context(Preferential preferential) {
        this.preferential = preferential;
    }

    public double getPrice(double orderPrice){
        return this.preferential.getPrice(new BigDecimal(orderPrice)).doubleValue();
    }
}
