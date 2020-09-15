package com.yyq.decorator;

/**
 * @author: 布里巴
 * @date: 2020/9/10
 */
public class SausageDecorator extends BatterCakeDecorator {
    public SausageDecorator(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    public String getMsg() {
        return super.getMsg() + "+1根香肠";
    }

    @Override
    public Integer getPrice() {
        return super.getPrice() + 2;
    }
}
