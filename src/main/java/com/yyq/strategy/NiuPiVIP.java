package com.yyq.strategy;

import java.math.BigDecimal;

/**
 * @author: 布里巴
 * @review:
 * @date: 2019/5/14
 *
 * 牛皮会员打7折
 */
public class NiuPiVIP implements Preferential {
    public BigDecimal getPrice(BigDecimal orderPrice) {
        return orderPrice.multiply(new BigDecimal(0.7));
    }
}
