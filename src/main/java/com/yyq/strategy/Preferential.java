package com.yyq.strategy;

import java.math.BigDecimal;

/**
 * @author: 布里巴
 * @review:
 * @date: 2019/5/14
 *
 * 打折策略-接口
 */
public interface Preferential {
    BigDecimal getPrice(BigDecimal orderPrice);
}
