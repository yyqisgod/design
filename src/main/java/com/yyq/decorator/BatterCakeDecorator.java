package com.yyq.decorator;

/**
 * @author: 布里巴
 * @date: 2020/9/10
 */
public class BatterCakeDecorator extends BatterCake {

    private BatterCake batterCake;

    public BatterCakeDecorator(BatterCake batterCake) {
        this.batterCake = batterCake;
    }

    @Override
    public String getMsg() {
        return this.batterCake.getMsg();
    }

    @Override
    public Integer getPrice() {
        return this.batterCake.getPrice();
    }
}
