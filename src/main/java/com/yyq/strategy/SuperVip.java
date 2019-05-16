package com.yyq.strategy;

import java.math.BigDecimal;

/**
 * @author: 布里巴
 * @review:
 * @date: 2019/5/14
 */
public class SuperVip implements Preferential {
    public BigDecimal getPrice(BigDecimal orderPrice) {
        return orderPrice.multiply(new BigDecimal(0.8));
    }
}
