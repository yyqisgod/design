package com.yyq.strategy;

import java.math.BigDecimal;

/**
 * @author: 布里巴
 * @review:
 * @date: 2019/5/14
 *
 * 会员打9折
 */
public class Vip implements Preferential {
    public BigDecimal getPrice(BigDecimal orderPrice) {
        return orderPrice.multiply(new BigDecimal(0.9));
    }
}
